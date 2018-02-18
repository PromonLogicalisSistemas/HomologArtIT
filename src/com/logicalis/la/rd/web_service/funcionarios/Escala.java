/**
 * Escala.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.logicalis.la.rd.web_service.funcionarios;

public class Escala  implements java.io.Serializable {
    private java.lang.String registro;

    private java.lang.String mes_periodo;

    private int ano_periodo;

    private int dia;

    private java.lang.String tipo_dia;

    private java.lang.String inicio_jornada;

    private java.lang.String fim_jornada;

    public Escala() {
    }

    public Escala(
           java.lang.String registro,
           java.lang.String mes_periodo,
           int ano_periodo,
           int dia,
           java.lang.String tipo_dia,
           java.lang.String inicio_jornada,
           java.lang.String fim_jornada) {
           this.registro = registro;
           this.mes_periodo = mes_periodo;
           this.ano_periodo = ano_periodo;
           this.dia = dia;
           this.tipo_dia = tipo_dia;
           this.inicio_jornada = inicio_jornada;
           this.fim_jornada = fim_jornada;
    }


    /**
     * Gets the registro value for this Escala.
     * 
     * @return registro
     */
    public java.lang.String getRegistro() {
        return registro;
    }


    /**
     * Sets the registro value for this Escala.
     * 
     * @param registro
     */
    public void setRegistro(java.lang.String registro) {
        this.registro = registro;
    }


    /**
     * Gets the mes_periodo value for this Escala.
     * 
     * @return mes_periodo
     */
    public java.lang.String getMes_periodo() {
        return mes_periodo;
    }


    /**
     * Sets the mes_periodo value for this Escala.
     * 
     * @param mes_periodo
     */
    public void setMes_periodo(java.lang.String mes_periodo) {
        this.mes_periodo = mes_periodo;
    }


    /**
     * Gets the ano_periodo value for this Escala.
     * 
     * @return ano_periodo
     */
    public int getAno_periodo() {
        return ano_periodo;
    }


    /**
     * Sets the ano_periodo value for this Escala.
     * 
     * @param ano_periodo
     */
    public void setAno_periodo(int ano_periodo) {
        this.ano_periodo = ano_periodo;
    }


    /**
     * Gets the dia value for this Escala.
     * 
     * @return dia
     */
    public int getDia() {
        return dia;
    }


    /**
     * Sets the dia value for this Escala.
     * 
     * @param dia
     */
    public void setDia(int dia) {
        this.dia = dia;
    }


    /**
     * Gets the tipo_dia value for this Escala.
     * 
     * @return tipo_dia
     */
    public java.lang.String getTipo_dia() {
        return tipo_dia;
    }


    /**
     * Sets the tipo_dia value for this Escala.
     * 
     * @param tipo_dia
     */
    public void setTipo_dia(java.lang.String tipo_dia) {
        this.tipo_dia = tipo_dia;
    }


    /**
     * Gets the inicio_jornada value for this Escala.
     * 
     * @return inicio_jornada
     */
    public java.lang.String getInicio_jornada() {
        return inicio_jornada;
    }


    /**
     * Sets the inicio_jornada value for this Escala.
     * 
     * @param inicio_jornada
     */
    public void setInicio_jornada(java.lang.String inicio_jornada) {
        this.inicio_jornada = inicio_jornada;
    }


    /**
     * Gets the fim_jornada value for this Escala.
     * 
     * @return fim_jornada
     */
    public java.lang.String getFim_jornada() {
        return fim_jornada;
    }


    /**
     * Sets the fim_jornada value for this Escala.
     * 
     * @param fim_jornada
     */
    public void setFim_jornada(java.lang.String fim_jornada) {
        this.fim_jornada = fim_jornada;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Escala)) return false;
        Escala other = (Escala) obj;
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
            ((this.mes_periodo==null && other.getMes_periodo()==null) || 
             (this.mes_periodo!=null &&
              this.mes_periodo.equals(other.getMes_periodo()))) &&
            this.ano_periodo == other.getAno_periodo() &&
            this.dia == other.getDia() &&
            ((this.tipo_dia==null && other.getTipo_dia()==null) || 
             (this.tipo_dia!=null &&
              this.tipo_dia.equals(other.getTipo_dia()))) &&
            ((this.inicio_jornada==null && other.getInicio_jornada()==null) || 
             (this.inicio_jornada!=null &&
              this.inicio_jornada.equals(other.getInicio_jornada()))) &&
            ((this.fim_jornada==null && other.getFim_jornada()==null) || 
             (this.fim_jornada!=null &&
              this.fim_jornada.equals(other.getFim_jornada())));
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
        if (getMes_periodo() != null) {
            _hashCode += getMes_periodo().hashCode();
        }
        _hashCode += getAno_periodo();
        _hashCode += getDia();
        if (getTipo_dia() != null) {
            _hashCode += getTipo_dia().hashCode();
        }
        if (getInicio_jornada() != null) {
            _hashCode += getInicio_jornada().hashCode();
        }
        if (getFim_jornada() != null) {
            _hashCode += getFim_jornada().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Escala.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rd.la.logicalis.com/web-service/funcionarios", "escala"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mes_periodo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mes_periodo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ano_periodo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ano_periodo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo_dia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipo_dia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inicio_jornada");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inicio_jornada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fim_jornada");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fim_jornada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
