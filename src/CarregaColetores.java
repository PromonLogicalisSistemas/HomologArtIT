import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.Normalizer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

import javax.xml.rpc.Call;
import javax.xml.rpc.holders.BooleanHolder;
import javax.xml.rpc.holders.StringHolder;

import org.apache.axis.client.Stub;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.logicalis.la.rd.web_service.coletores_custos.ColetorCusto;
import com.logicalis.la.rd.web_service.coletores_custos.WebServiceSapServicePort;
import com.logicalis.la.rd.web_service.coletores_custos.WebServiceSapServiceServiceLocator;

public class CarregaColetores {

	public static Calendar cal = Calendar.getInstance();
	public static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

	public static ColetorCusto[] carregaColetoresCusto(String[] paths) throws Exception {
		ArrayList<ColetorCusto> list = new ArrayList<ColetorCusto>();

		for (int i = 0; i < paths.length; i++) {

			//BufferedReader br = new BufferedReader(new FileReader(paths[i]));
			BufferedReader br = new BufferedReader(new InputStreamReader(
					new FileInputStream(paths[i]), "UTF8"));
			
			String linha = br.readLine(); // remove cabeçalho

			String tipo = getTipo(paths[i]);

			while ((linha = br.readLine()) != null) {
				String[] c = linha.split(";");
				ColetorCusto f = new ColetorCusto();
				if("ORD".equals(tipo)){
					int id_empresa_sap = Integer.parseInt(c[2]);//Integer.parseInt(enc(c[2]));
					if(id_empresa_sap==30 || id_empresa_sap==34){
						populaORD(f, c);
					}else{
						continue;
					}
				// PEP!
				}else{
					int id_empresa_sap = Integer.parseInt(c[4]);//Integer.parseInt(enc(c[4]));
					String[] campos = c[1].split("\\.");
					if(campos.length> 3 && campos[2].equals("SP") &&
							(id_empresa_sap==30 || id_empresa_sap==34))
						populaPEP(f, c);
					else{
						continue;
					}
				}
				list.add(f);
			}

		}
		return list.toArray(new ColetorCusto[0]);
	}

	private static String getTipo(String filename) {
		System.out.println(filename);
		if (filename.toUpperCase().split("/")[filename.split("/").length-1].startsWith("ORD")) {
			return "ORD";
		}
		return "PEP";
	}

	public static String enc(String original) {
		return original;//Normalizer.normalize(original, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
	}

	private static void populaORD(ColetorCusto f, String[] c) throws ParseException {

		// Mandatory

		f.setCentro_custo("");
		f.setOrdem_interna(c[0]); //f.setOrdem_interna(enc(c[0]));
		f.setElemento_pep("");

		f.setTipo("ORD");
		f.setDescricao(enc(c[1])); // Charset.forName("UTF-8").encode(myString)
		f.setRegistro_gestor(RE2Number(c[6])); //f.setRegistro_gestor(RE2Number(enc(c[6])));

		int id_empresa_sap = Integer.parseInt(c[2]);
		int id_empresa_totvs = id_empresa_sap;
		switch (id_empresa_sap) {
		case 34:
			id_empresa_totvs = 74;
			break;
		case 30:
			id_empresa_totvs = 34;
			break;
		default:
			id_empresa_totvs = 34;
			break;
		}
		f.setId_empresa_totvs(id_empresa_totvs);
		// f.setSituacao(null); //7
		f.setExcluido(false); // 8

	}

	private static void populaPEP(ColetorCusto f, String[] c) throws ParseException {

		f.setCentro_custo("");
		f.setOrdem_interna("");
		
		if(c[1].trim().length() < 2){
			System.out.print("ERRO:");
			System.out.println("Elemento PEP vazio!");
		}
		f.setElemento_pep(c[1]);

		f.setTipo("PEP");
		
		
		if(c[3].trim().length() < 2){
			System.out.print("ERRO:");
			System.out.println("PEP descrição vazia!");
			c[3] = "N/A";
		}
		f.setDescricao(enc(c[3]));
		
		
		if(RE2Number(c[11]).trim().length() < 2){
			System.out.println("ERRO: #Gestor com problema: "+RE2Number(c[11]));
		}
		f.setRegistro_gestor(RE2Number(c[11]));

		int id_empresa_sap = Integer.parseInt(c[4]);
		int id_empresa_totvs = id_empresa_sap;
		switch (id_empresa_sap) {
		case 34:
			id_empresa_totvs = 74;
			break;
		case 30:
			id_empresa_totvs = 34;
			break;
		default:
			id_empresa_totvs = 34;
			break;
		}
		f.setId_empresa_totvs(id_empresa_totvs);
		// f.setSituacao(null); //7
		f.setExcluido(false); // 8

	}
	
	
	private static String RE2Number(String re) {
		String noletters = re.toLowerCase().replaceAll("[^0-9]+", "");
		return ""+Integer.parseInt(noletters);
	}

	public static void main(String[] args) throws Exception {
		
		BooleanHolder ok = new BooleanHolder();
		StringHolder msg = new StringHolder();

		WebServiceSapServiceServiceLocator locator = new WebServiceSapServiceServiceLocator();
		locator.setWebServiceSapServicePortEndpointAddress("http://ts.br.promonlogicalis.com/web-service/coletores-custos#coletoresCustos");
		System.out.println(locator.getWebServiceSapServicePortAddress());
		WebServiceSapServicePort service = locator.getWebServiceSapServicePort();
		
		System.out.println(locator.getWebServiceSapServicePortAddress());
		ColetorCusto[] coletores = carregaColetoresCusto(listaConteudoNoDir("data/PRD/"));
		
//		for (int i = 0; i < 10; i++)
//			System.out.println(ReflectionToStringBuilder.toString(coletores[i]));

		System.out.println("Num de coletores totais a serem enviados:" + coletores.length);

		int offset = 0;
		int limit = 400000;
		while (offset < coletores.length) {
			System.out.printf("Enviando range offset=%s e limit=%s\n", offset,
					Math.min(offset + limit, coletores.length));
			ColetorCusto[] cols = Arrays.copyOfRange(coletores, offset, Math.min(offset + limit, coletores.length));
			try {
				service.coletoresCustos(cols, ok, msg);
				offset += limit;
			} catch (Exception e) {
				offset = coletores.length;
				throw e;
			} finally {
				System.out.println("=====================================================");
				System.out.println(ok.value);
				System.out.println(msg.value);
				System.out.println("=====================================================");
				break;
			}
		}

	}

	private static String[] listaConteudoNoDir(String path) {
		File dir = new File(path);
		String[] arquivos = dir.list();
		String[] resp = new String[arquivos.length];
		int i = 0;
		for (String a : arquivos) {
			resp[i++] = path + a;
		}
		return resp;
	}

	public static String imprimeColetor(ColetorCusto coletor) {
		return ReflectionToStringBuilder.toString(coletor);
	}

}
