/**
 * WebServiceTotvsServicePort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.logicalis.la.rd.web_service.funcionarios;

public interface WebServiceTotvsServicePort extends java.rmi.Remote {

    /**
     * Serviço para receber funcionários do TOTVS
     */
    public void funcionarios(com.logicalis.la.rd.web_service.funcionarios.Funcionario[] funcionario, javax.xml.rpc.holders.BooleanHolder funcionariosResult, javax.xml.rpc.holders.StringHolder msgError) throws java.rmi.RemoteException;

    /**
     * Serviço para receber as escalas dos funcionários
     */
    public void escalas(com.logicalis.la.rd.web_service.funcionarios.Escala[] escala, javax.xml.rpc.holders.BooleanHolder escalasResult, javax.xml.rpc.holders.StringHolder msgError) throws java.rmi.RemoteException;
}
