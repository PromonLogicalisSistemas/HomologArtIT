package com.logicalis.la.rd.web_service.funcionarios;

public class WebServiceTotvsServicePortProxy implements com.logicalis.la.rd.web_service.funcionarios.WebServiceTotvsServicePort {
  private String _endpoint = null;
  private com.logicalis.la.rd.web_service.funcionarios.WebServiceTotvsServicePort webServiceTotvsServicePort = null;
  
  public WebServiceTotvsServicePortProxy() {
    _initWebServiceTotvsServicePortProxy();
  }
  
  public WebServiceTotvsServicePortProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebServiceTotvsServicePortProxy();
  }
  
  private void _initWebServiceTotvsServicePortProxy() {
    try {
      webServiceTotvsServicePort = (new com.logicalis.la.rd.web_service.funcionarios.WebServiceTotvsServiceServiceLocator()).getWebServiceTotvsServicePort();
      if (webServiceTotvsServicePort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webServiceTotvsServicePort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webServiceTotvsServicePort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webServiceTotvsServicePort != null)
      ((javax.xml.rpc.Stub)webServiceTotvsServicePort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.logicalis.la.rd.web_service.funcionarios.WebServiceTotvsServicePort getWebServiceTotvsServicePort() {
    if (webServiceTotvsServicePort == null)
      _initWebServiceTotvsServicePortProxy();
    return webServiceTotvsServicePort;
  }
  
  public void funcionarios(com.logicalis.la.rd.web_service.funcionarios.Funcionario[] funcionario, javax.xml.rpc.holders.BooleanHolder funcionariosResult, javax.xml.rpc.holders.StringHolder msgError) throws java.rmi.RemoteException{
    if (webServiceTotvsServicePort == null)
      _initWebServiceTotvsServicePortProxy();
    webServiceTotvsServicePort.funcionarios(funcionario, funcionariosResult, msgError);
  }
  
  public void escalas(com.logicalis.la.rd.web_service.funcionarios.Escala[] escala, javax.xml.rpc.holders.BooleanHolder escalasResult, javax.xml.rpc.holders.StringHolder msgError) throws java.rmi.RemoteException{
    if (webServiceTotvsServicePort == null)
      _initWebServiceTotvsServicePortProxy();
    webServiceTotvsServicePort.escalas(escala, escalasResult, msgError);
  }
  
  
}