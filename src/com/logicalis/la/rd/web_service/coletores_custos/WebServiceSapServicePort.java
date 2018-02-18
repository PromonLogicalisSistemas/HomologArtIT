/**
 * WebServiceSapServicePort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.logicalis.la.rd.web_service.coletores_custos;

public interface WebServiceSapServicePort extends java.rmi.Remote {

    /**
     * Serviço para receber coletores de custos do SAP
     */
    public void coletoresCustos(com.logicalis.la.rd.web_service.coletores_custos.ColetorCusto[] coletorCusto, javax.xml.rpc.holders.BooleanHolder coletoresCustosResult, javax.xml.rpc.holders.StringHolder msgError) throws java.rmi.RemoteException;

    /**
     * Serviço para enviar coletores de custos para SAP
     */
    public com.logicalis.la.rd.web_service.coletores_custos.EnviaContaCorrenteConbilizacaoResponse[] enviaContaCorrenteConbilizacao(java.lang.String data) throws java.rmi.RemoteException;
}
