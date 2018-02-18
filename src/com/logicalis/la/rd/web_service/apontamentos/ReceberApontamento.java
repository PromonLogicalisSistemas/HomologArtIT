/**
 * ReceberApontamento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.logicalis.la.rd.web_service.apontamentos;

public class ReceberApontamento  implements java.io.Serializable {
    private java.lang.String registro;

    private java.lang.String id_batida;

    private java.util.Date data;

    private java.lang.String hora;

    private java.lang.Integer codigo_observacao;

    private java.lang.String descricao_observacao;

    public ReceberApontamento() {
    }

    public ReceberApontamento(
           java.lang.String registro,
           java.lang.String id_batida,
           java.util.Date data,
           java.lang.String hora,
           java.lang.Integer codigo_observacao,
           java.lang.String descricao_observacao) {
           this.registro = registro;
           this.id_batida = id_batida;
           this.data = data;
           this.hora = hora;
           this.codigo_observacao = codigo_observacao;
           this.descricao_observacao = descricao_observacao;
    }


    /**
     * Gets the registro value for this ReceberApontamento.
     * 
     * @return registro
     */
    public java.lang.String getRegistro() {
        return registro;
    }


    /**
     * Sets the registro value for this ReceberApontamento.
     * 
     * @param registro
     */
    public void setRegistro(java.lang.String registro) {
        this.registro = registro;
    }


    /**
     * Gets the id_batida value for this ReceberApontamento.
     * 
     * @return id_batida
     */
    public java.lang.String getId_batida() {
        return id_batida;
    }


    /**
     * Sets the id_batida value for this ReceberApontamento.
     * 
     * @param id_batida
     */
    public void setId_batida(java.lang.String id_batida) {
        this.id_batida = id_batida;
    }


    /**
     * Gets the data value for this ReceberApontamento.
     * 
     * @return data
     */
    public java.util.Date getData() {
        return data;
    }


    /**
     * Sets the data value for this ReceberApontamento.
     * 
     * @param data
     */
    public void setData(java.util.Date data) {
        this.data = data;
    }


    /**
     * Gets the hora value for this ReceberApontamento.
     * 
     * @return hora
     */
    public java.lang.String getHora() {
        return hora;
    }


    /**
     * Sets the hora value for this ReceberApontamento.
     * 
     * @param hora
     */
    public void setHora(java.lang.String hora) {
        this.hora = hora;
    }


    /**
     * Gets the codigo_observacao value for this ReceberApontamento.
     * 
     * @return codigo_observacao
     */
    public java.lang.Integer getCodigo_observacao() {
        return codigo_observacao;
    }


    /**
     * Sets the codigo_observacao value for this ReceberApontamento.
     * 
     * @param codigo_observacao
     */
    public void setCodigo_observacao(java.lang.Integer codigo_observacao) {
        this.codigo_observacao = codigo_observacao;
    }


    /**
     * Gets the descricao_observacao value for this ReceberApontamento.
     * 
     * @return descricao_observacao
     */
    public java.lang.String getDescricao_observacao() {
        return descricao_observacao;
    }


    /**
     * Sets the descricao_observacao value for this ReceberApontamento.
     * 
     * @param descricao_observacao
     */
    public void setDescricao_observacao(java.lang.String descricao_observacao) {
        this.descricao_observacao = descricao_observacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReceberApontamento)) return false;
        ReceberApontamento other = (ReceberApontamento) obj;
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
            ((this.id_batida==null && other.getId_batida()==null) || 
             (this.id_batida!=null &&
              this.id_batida.equals(other.getId_batida()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            ((this.hora==null && other.getHora()==null) || 
             (this.hora!=null &&
              this.hora.equals(other.getHora()))) &&
            ((this.codigo_observacao==null && other.getCodigo_observacao()==null) || 
             (this.codigo_observacao!=null &&
              this.codigo_observacao.equals(other.getCodigo_observacao()))) &&
            ((this.descricao_observacao==null && other.getDescricao_observacao()==null) || 
             (this.descricao_observacao!=null &&
              this.descricao_observacao.equals(other.getDescricao_observacao())));
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
        if (getId_batida() != null) {
            _hashCode += getId_batida().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        if (getHora() != null) {
            _hashCode += getHora().hashCode();
        }
        if (getCodigo_observacao() != null) {
            _hashCode += getCodigo_observacao().hashCode();
        }
        if (getDescricao_observacao() != null) {
            _hashCode += getDescricao_observacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReceberApontamento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rd.la.logicalis.com/web-service/apontamentos", "receberApontamento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id_batida");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id_batida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hora");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo_observacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigo_observacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao_observacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descricao_observacao"));
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
