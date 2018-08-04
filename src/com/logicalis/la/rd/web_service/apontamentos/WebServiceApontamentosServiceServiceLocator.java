/**
 * WebServiceApontamentosServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.logicalis.la.rd.web_service.apontamentos;

public class WebServiceApontamentosServiceServiceLocator extends org.apache.axis.client.Service implements com.logicalis.la.rd.web_service.apontamentos.WebServiceApontamentosServiceService {

    public WebServiceApontamentosServiceServiceLocator() {
    }


    public WebServiceApontamentosServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebServiceApontamentosServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WebServiceApontamentosServicePort
    private java.lang.String WebServiceApontamentosServicePort_address = "http://ts-dev.br.promonlogicalis.com/web-service/apontamentos";

    public java.lang.String getWebServiceApontamentosServicePortAddress() {
        return WebServiceApontamentosServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WebServiceApontamentosServicePortWSDDServiceName = "WebServiceApontamentosServicePort";

    public java.lang.String getWebServiceApontamentosServicePortWSDDServiceName() {
        return WebServiceApontamentosServicePortWSDDServiceName;
    }

    public void setWebServiceApontamentosServicePortWSDDServiceName(java.lang.String name) {
        WebServiceApontamentosServicePortWSDDServiceName = name;
    }

    public com.logicalis.la.rd.web_service.apontamentos.WebServiceApontamentosServicePort getWebServiceApontamentosServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WebServiceApontamentosServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebServiceApontamentosServicePort(endpoint);
    }

    public com.logicalis.la.rd.web_service.apontamentos.WebServiceApontamentosServicePort getWebServiceApontamentosServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.logicalis.la.rd.web_service.apontamentos.WebServiceApontamentosServiceBindingStub _stub = new com.logicalis.la.rd.web_service.apontamentos.WebServiceApontamentosServiceBindingStub(portAddress, this);
            _stub.setPortName(getWebServiceApontamentosServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebServiceApontamentosServicePortEndpointAddress(java.lang.String address) {
        WebServiceApontamentosServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.logicalis.la.rd.web_service.apontamentos.WebServiceApontamentosServicePort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.logicalis.la.rd.web_service.apontamentos.WebServiceApontamentosServiceBindingStub _stub = new com.logicalis.la.rd.web_service.apontamentos.WebServiceApontamentosServiceBindingStub(new java.net.URL(WebServiceApontamentosServicePort_address), this);
                _stub.setPortName(getWebServiceApontamentosServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WebServiceApontamentosServicePort".equals(inputPortName)) {
            return getWebServiceApontamentosServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://rd.la.logicalis.com/web-service/apontamentos", "WebServiceApontamentosServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://rd.la.logicalis.com/web-service/apontamentos", "WebServiceApontamentosServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WebServiceApontamentosServicePort".equals(portName)) {
            setWebServiceApontamentosServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
