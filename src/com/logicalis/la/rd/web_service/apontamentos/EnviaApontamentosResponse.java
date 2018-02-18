/**
 * EnviaApontamentosResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.logicalis.la.rd.web_service.apontamentos;

public class EnviaApontamentosResponse  implements java.io.Serializable {
    private java.lang.Integer nsr;

    private java.lang.String registro;

    private java.util.Date data;

    private java.lang.String horario;

    private java.lang.String quantidade_horas;

    private java.lang.String tipo;

    private java.lang.String justificativa_ajuste;

    public EnviaApontamentosResponse() {
    }

    public EnviaApontamentosResponse(
           java.lang.Integer nsr,
           java.lang.String registro,
           java.util.Date data,
           java.lang.String horario,
           java.lang.String quantidade_horas,
           java.lang.String tipo,
           java.lang.String justificativa_ajuste) {
           this.nsr = nsr;
           this.registro = registro;
           this.data = data;
           this.horario = horario;
           this.quantidade_horas = quantidade_horas;
           this.tipo = tipo;
           this.justificativa_ajuste = justificativa_ajuste;
    }


    /**
     * Gets the nsr value for this EnviaApontamentosResponse.
     * 
     * @return nsr
     */
    public java.lang.Integer getNsr() {
        return nsr;
    }


    /**
     * Sets the nsr value for this EnviaApontamentosResponse.
     * 
     * @param nsr
     */
    public void setNsr(java.lang.Integer nsr) {
        this.nsr = nsr;
    }


    /**
     * Gets the registro value for this EnviaApontamentosResponse.
     * 
     * @return registro
     */
    public java.lang.String getRegistro() {
        return registro;
    }


    /**
     * Sets the registro value for this EnviaApontamentosResponse.
     * 
     * @param registro
     */
    public void setRegistro(java.lang.String registro) {
        this.registro = registro;
    }


    /**
     * Gets the data value for this EnviaApontamentosResponse.
     * 
     * @return data
     */
    public java.util.Date getData() {
        return data;
    }


    /**
     * Sets the data value for this EnviaApontamentosResponse.
     * 
     * @param data
     */
    public void setData(java.util.Date data) {
        this.data = data;
    }


    /**
     * Gets the horario value for this EnviaApontamentosResponse.
     * 
     * @return horario
     */
    public java.lang.String getHorario() {
        return horario;
    }


    /**
     * Sets the horario value for this EnviaApontamentosResponse.
     * 
     * @param horario
     */
    public void setHorario(java.lang.String horario) {
        this.horario = horario;
    }


    /**
     * Gets the quantidade_horas value for this EnviaApontamentosResponse.
     * 
     * @return quantidade_horas
     */
    public java.lang.String getQuantidade_horas() {
        return quantidade_horas;
    }


    /**
     * Sets the quantidade_horas value for this EnviaApontamentosResponse.
     * 
     * @param quantidade_horas
     */
    public void setQuantidade_horas(java.lang.String quantidade_horas) {
        this.quantidade_horas = quantidade_horas;
    }


    /**
     * Gets the tipo value for this EnviaApontamentosResponse.
     * 
     * @return tipo
     */
    public java.lang.String getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this EnviaApontamentosResponse.
     * 
     * @param tipo
     */
    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the justificativa_ajuste value for this EnviaApontamentosResponse.
     * 
     * @return justificativa_ajuste
     */
    public java.lang.String getJustificativa_ajuste() {
        return justificativa_ajuste;
    }


    /**
     * Sets the justificativa_ajuste value for this EnviaApontamentosResponse.
     * 
     * @param justificativa_ajuste
     */
    public void setJustificativa_ajuste(java.lang.String justificativa_ajuste) {
        this.justificativa_ajuste = justificativa_ajuste;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnviaApontamentosResponse)) return false;
        EnviaApontamentosResponse other = (EnviaApontamentosResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nsr==null && other.getNsr()==null) || 
             (this.nsr!=null &&
              this.nsr.equals(other.getNsr()))) &&
            ((this.registro==null && other.getRegistro()==null) || 
             (this.registro!=null &&
              this.registro.equals(other.getRegistro()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            ((this.horario==null && other.getHorario()==null) || 
             (this.horario!=null &&
              this.horario.equals(other.getHorario()))) &&
            ((this.quantidade_horas==null && other.getQuantidade_horas()==null) || 
             (this.quantidade_horas!=null &&
              this.quantidade_horas.equals(other.getQuantidade_horas()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.justificativa_ajuste==null && other.getJustificativa_ajuste()==null) || 
             (this.justificativa_ajuste!=null &&
              this.justificativa_ajuste.equals(other.getJustificativa_ajuste())));
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
        if (getNsr() != null) {
            _hashCode += getNsr().hashCode();
        }
        if (getRegistro() != null) {
            _hashCode += getRegistro().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        if (getHorario() != null) {
            _hashCode += getHorario().hashCode();
        }
        if (getQuantidade_horas() != null) {
            _hashCode += getQuantidade_horas().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getJustificativa_ajuste() != null) {
            _hashCode += getJustificativa_ajuste().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnviaApontamentosResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rd.la.logicalis.com/web-service/apontamentos", "enviaApontamentosResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nsr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nsr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registro"));
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
        elemField.setFieldName("horario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "horario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantidade_horas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantidade_horas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("justificativa_ajuste");
        elemField.setXmlName(new javax.xml.namespace.QName("", "justificativa_ajuste"));
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
