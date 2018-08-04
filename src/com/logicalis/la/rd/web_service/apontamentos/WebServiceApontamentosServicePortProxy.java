package com.logicalis.la.rd.web_service.apontamentos;

public class WebServiceApontamentosServicePortProxy implements com.logicalis.la.rd.web_service.apontamentos.WebServiceApontamentosServicePort {
  private String _endpoint = null;
  private com.logicalis.la.rd.web_service.apontamentos.WebServiceApontamentosServicePort webServiceApontamentosServicePort = null;
  
  public WebServiceApontamentosServicePortProxy() {
    _initWebServiceApontamentosServicePortProxy();
  }
  
  public WebServiceApontamentosServicePortProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebServiceApontamentosServicePortProxy();
  }
  
  private void _initWebServiceApontamentosServicePortProxy() {
    try {
      webServiceApontamentosServicePort = (new com.logicalis.la.rd.web_service.apontamentos.WebServiceApontamentosServiceServiceLocator()).getWebServiceApontamentosServicePort();
      if (webServiceApontamentosServicePort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webServiceApontamentosServicePort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webServiceApontamentosServicePort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webServiceApontamentosServicePort != null)
      ((javax.xml.rpc.Stub)webServiceApontamentosServicePort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.logicalis.la.rd.web_service.apontamentos.WebServiceApontamentosServicePort getWebServiceApontamentosServicePort() {
    if (webServiceApontamentosServicePort == null)
      _initWebServiceApontamentosServicePortProxy();
    return webServiceApontamentosServicePort;
  }
  
  public void receberDivergencias(com.logicalis.la.rd.web_service.apontamentos.RecebeDivergencia[] recebeDivergencia, javax.xml.rpc.holders.BooleanHolder receberDivergenciasResult, javax.xml.rpc.holders.StringHolder msgError) throws java.rmi.RemoteException{
    if (webServiceApontamentosServicePort == null)
      _initWebServiceApontamentosServicePortProxy();
    webServiceApontamentosServicePort.receberDivergencias(recebeDivergencia, receberDivergenciasResult, msgError);
  }
  
  public com.logicalis.la.rd.web_service.apontamentos.EnviaApontamentosResponse[] enviaApontamentos(java.lang.String data_inicio, java.lang.String data_fim) throws java.rmi.RemoteException{
    if (webServiceApontamentosServicePort == null)
      _initWebServiceApontamentosServicePortProxy();
    return webServiceApontamentosServicePort.enviaApontamentos(data_inicio, data_fim);
  }
  
  
}