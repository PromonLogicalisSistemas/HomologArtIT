package com.logicalis.la.rd.web_service.coletores_custos;

public class WebServiceSapServicePortProxy implements com.logicalis.la.rd.web_service.coletores_custos.WebServiceSapServicePort {
  private String _endpoint = null;
  private com.logicalis.la.rd.web_service.coletores_custos.WebServiceSapServicePort webServiceSapServicePort = null;
  
  public WebServiceSapServicePortProxy() {
    _initWebServiceSapServicePortProxy();
  }
  
  public WebServiceSapServicePortProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebServiceSapServicePortProxy();
  }
  
  private void _initWebServiceSapServicePortProxy() {
    try {
      webServiceSapServicePort = (new com.logicalis.la.rd.web_service.coletores_custos.WebServiceSapServiceServiceLocator()).getWebServiceSapServicePort();
      if (webServiceSapServicePort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webServiceSapServicePort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webServiceSapServicePort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webServiceSapServicePort != null)
      ((javax.xml.rpc.Stub)webServiceSapServicePort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.logicalis.la.rd.web_service.coletores_custos.WebServiceSapServicePort getWebServiceSapServicePort() {
    if (webServiceSapServicePort == null)
      _initWebServiceSapServicePortProxy();
    return webServiceSapServicePort;
  }
  
  public void coletoresCustos(com.logicalis.la.rd.web_service.coletores_custos.ColetorCusto[] coletorCusto, javax.xml.rpc.holders.BooleanHolder coletoresCustosResult, javax.xml.rpc.holders.StringHolder msgError) throws java.rmi.RemoteException{
    if (webServiceSapServicePort == null)
      _initWebServiceSapServicePortProxy();
    webServiceSapServicePort.coletoresCustos(coletorCusto, coletoresCustosResult, msgError);
  }
  
  public com.logicalis.la.rd.web_service.coletores_custos.EnviaContaCorrenteConbilizacaoResponse[] enviaContaCorrenteConbilizacao(java.lang.String data) throws java.rmi.RemoteException{
    if (webServiceSapServicePort == null)
      _initWebServiceSapServicePortProxy();
    return webServiceSapServicePort.enviaContaCorrenteConbilizacao(data);
  }
  
  
}