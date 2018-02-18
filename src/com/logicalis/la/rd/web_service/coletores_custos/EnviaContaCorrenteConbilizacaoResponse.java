/**
 * EnviaContaCorrenteConbilizacaoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.logicalis.la.rd.web_service.coletores_custos;

public class EnviaContaCorrenteConbilizacaoResponse  implements java.io.Serializable {
    private java.lang.String registro;

    private java.lang.String qtde_horas;

    private java.lang.String coletor_custo;

    private java.lang.String tipo;

    private java.util.Date data_competencia;

    private java.lang.String data_modificacao;

    public EnviaContaCorrenteConbilizacaoResponse() {
    }

    public EnviaContaCorrenteConbilizacaoResponse(
           java.lang.String registro,
           java.lang.String qtde_horas,
           java.lang.String coletor_custo,
           java.lang.String tipo,
           java.util.Date data_competencia,
           java.lang.String data_modificacao) {
           this.registro = registro;
           this.qtde_horas = qtde_horas;
           this.coletor_custo = coletor_custo;
           this.tipo = tipo;
           this.data_competencia = data_competencia;
           this.data_modificacao = data_modificacao;
    }


    /**
     * Gets the registro value for this EnviaContaCorrenteConbilizacaoResponse.
     * 
     * @return registro
     */
    public java.lang.String getRegistro() {
        return registro;
    }


    /**
     * Sets the registro value for this EnviaContaCorrenteConbilizacaoResponse.
     * 
     * @param registro
     */
    public void setRegistro(java.lang.String registro) {
        this.registro = registro;
    }


    /**
     * Gets the qtde_horas value for this EnviaContaCorrenteConbilizacaoResponse.
     * 
     * @return qtde_horas
     */
    public java.lang.String getQtde_horas() {
        return qtde_horas;
    }


    /**
     * Sets the qtde_horas value for this EnviaContaCorrenteConbilizacaoResponse.
     * 
     * @param qtde_horas
     */
    public void setQtde_horas(java.lang.String qtde_horas) {
        this.qtde_horas = qtde_horas;
    }


    /**
     * Gets the coletor_custo value for this EnviaContaCorrenteConbilizacaoResponse.
     * 
     * @return coletor_custo
     */
    public java.lang.String getColetor_custo() {
        return coletor_custo;
    }


    /**
     * Sets the coletor_custo value for this EnviaContaCorrenteConbilizacaoResponse.
     * 
     * @param coletor_custo
     */
    public void setColetor_custo(java.lang.String coletor_custo) {
        this.coletor_custo = coletor_custo;
    }


    /**
     * Gets the tipo value for this EnviaContaCorrenteConbilizacaoResponse.
     * 
     * @return tipo
     */
    public java.lang.String getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this EnviaContaCorrenteConbilizacaoResponse.
     * 
     * @param tipo
     */
    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the data_competencia value for this EnviaContaCorrenteConbilizacaoResponse.
     * 
     * @return data_competencia
     */
    public java.util.Date getData_competencia() {
        return data_competencia;
    }


    /**
     * Sets the data_competencia value for this EnviaContaCorrenteConbilizacaoResponse.
     * 
     * @param data_competencia
     */
    public void setData_competencia(java.util.Date data_competencia) {
        this.data_competencia = data_competencia;
    }


    /**
     * Gets the data_modificacao value for this EnviaContaCorrenteConbilizacaoResponse.
     * 
     * @return data_modificacao
     */
    public java.lang.String getData_modificacao() {
        return data_modificacao;
    }


    /**
     * Sets the data_modificacao value for this EnviaContaCorrenteConbilizacaoResponse.
     * 
     * @param data_modificacao
     */
    public void setData_modificacao(java.lang.String data_modificacao) {
        this.data_modificacao = data_modificacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnviaContaCorrenteConbilizacaoResponse)) return false;
        EnviaContaCorrenteConbilizacaoResponse other = (EnviaContaCorrenteConbilizacaoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registro==null && other.getRegistro()==null) || 
             (this.registro!=null &&
              this.registro.equals(other.getRegistro()))) &&
            ((this.qtde_horas==null && other.getQtde_horas()==null) || 
             (this.qtde_horas!=null &&
              this.qtde_horas.equals(other.getQtde_horas()))) &&
            ((this.coletor_custo==null && other.getColetor_custo()==null) || 
             (this.coletor_custo!=null &&
              this.coletor_custo.equals(other.getColetor_custo()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.data_competencia==null && other.getData_competencia()==null) || 
             (this.data_competencia!=null &&
              this.data_competencia.equals(other.getData_competencia()))) &&
            ((this.data_modificacao==null && other.getData_modificacao()==null) || 
             (this.data_modificacao!=null &&
              this.data_modificacao.equals(other.getData_modificacao())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRegistro() != null) {
            _hashCode += getRegistro().hashCode();
        }
        if (getQtde_horas() != null) {
            _hashCode += getQtde_horas().hashCode();
        }
        if (getColetor_custo() != null) {
            _hashCode += getColetor_custo().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getData_competencia() != null) {
            _hashCode += getData_competencia().hashCode();
        }
        if (getData_modificacao() != null) {
            _hashCode += getData_modificacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnviaContaCorrenteConbilizacaoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rd.la.logicalis.com/web-service/coletores-custos", "enviaContaCorrenteConbilizacaoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtde_horas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qtde_horas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coletor_custo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coletor_custo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data_competencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data_competencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data_modificacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data_modificacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
