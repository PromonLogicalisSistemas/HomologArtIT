/**
 * WebServiceApontamentosServicePort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.logicalis.la.rd.web_service.apontamentos;

public interface WebServiceApontamentosServicePort extends java.rmi.Remote {

    /**
     * Serviço para receber Apontamentos dos Relógios de Ponto
     */
    public void receberDivergencias(com.logicalis.la.rd.web_service.apontamentos.RecebeDivergencia[] recebeDivergencia, javax.xml.rpc.holders.BooleanHolder receberDivergenciasResult, javax.xml.rpc.holders.StringHolder msgError) throws java.rmi.RemoteException;

    /**
     * Serviço para enviar todos os Apontamentos do sistema
     */
    public com.logicalis.la.rd.web_service.apontamentos.EnviaApontamentosResponse[] enviaApontamentos(java.lang.String data_inicio, java.lang.String data_fim) throws java.rmi.RemoteException;
}
