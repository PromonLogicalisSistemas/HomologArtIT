/**
 * ColetorCusto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.logicalis.la.rd.web_service.coletores_custos;

public class ColetorCusto  implements java.io.Serializable {
    private java.lang.String centro_custo;

    private java.lang.String ordem_interna;

    private java.lang.String elemento_pep;

    private java.lang.String tipo;

    private java.lang.String descricao;

    private java.lang.String registro_gestor;

    private int id_empresa_totvs;

    private java.lang.String situacao;

    private boolean excluido;

    public ColetorCusto() {
    }

    public ColetorCusto(
           java.lang.String centro_custo,
           java.lang.String ordem_interna,
           java.lang.String elemento_pep,
           java.lang.String tipo,
           java.lang.String descricao,
           java.lang.String registro_gestor,
           int id_empresa_totvs,
           java.lang.String situacao,
           boolean excluido) {
           this.centro_custo = centro_custo;
           this.ordem_interna = ordem_interna;
           this.elemento_pep = elemento_pep;
           this.tipo = tipo;
           this.descricao = descricao;
           this.registro_gestor = registro_gestor;
           this.id_empresa_totvs = id_empresa_totvs;
           this.situacao = situacao;
           this.excluido = excluido;
    }


    /**
     * Gets the centro_custo value for this ColetorCusto.
     * 
     * @return centro_custo
     */
    public java.lang.String getCentro_custo() {
        return centro_custo;
    }


    /**
     * Sets the centro_custo value for this ColetorCusto.
     * 
     * @param centro_custo
     */
    public void setCentro_custo(java.lang.String centro_custo) {
        this.centro_custo = centro_custo;
    }


    /**
     * Gets the ordem_interna value for this ColetorCusto.
     * 
     * @return ordem_interna
     */
    public java.lang.String getOrdem_interna() {
        return ordem_interna;
    }


    /**
     * Sets the ordem_interna value for this ColetorCusto.
     * 
     * @param ordem_interna
     */
    public void setOrdem_interna(java.lang.String ordem_interna) {
        this.ordem_interna = ordem_interna;
    }


    /**
     * Gets the elemento_pep value for this ColetorCusto.
     * 
     * @return elemento_pep
     */
    public java.lang.String getElemento_pep() {
        return elemento_pep;
    }


    /**
     * Sets the elemento_pep value for this ColetorCusto.
     * 
     * @param elemento_pep
     */
    public void setElemento_pep(java.lang.String elemento_pep) {
        this.elemento_pep = elemento_pep;
    }


    /**
     * Gets the tipo value for this ColetorCusto.
     * 
     * @return tipo
     */
    public java.lang.String getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this ColetorCusto.
     * 
     * @param tipo
     */
    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the descricao value for this ColetorCusto.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this ColetorCusto.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the registro_gestor value for this ColetorCusto.
     * 
     * @return registro_gestor
     */
    public java.lang.String getRegistro_gestor() {
        return registro_gestor;
    }


    /**
     * Sets the registro_gestor value for this ColetorCusto.
     * 
     * @param registro_gestor
     */
    public void setRegistro_gestor(java.lang.String registro_gestor) {
        this.registro_gestor = registro_gestor;
    }


    /**
     * Gets the id_empresa_totvs value for this ColetorCusto.
     * 
     * @return id_empresa_totvs
     */
    public int getId_empresa_totvs() {
        return id_empresa_totvs;
    }


    /**
     * Sets the id_empresa_totvs value for this ColetorCusto.
     * 
     * @param id_empresa_totvs
     */
    public void setId_empresa_totvs(int id_empresa_totvs) {
        this.id_empresa_totvs = id_empresa_totvs;
    }


    /**
     * Gets the situacao value for this ColetorCusto.
     * 
     * @return situacao
     */
    public java.lang.String getSituacao() {
        return situacao;
    }


    /**
     * Sets the situacao value for this ColetorCusto.
     * 
     * @param situacao
     */
    public void setSituacao(java.lang.String situacao) {
        this.situacao = situacao;
    }


    /**
     * Gets the excluido value for this ColetorCusto.
     * 
     * @return excluido
     */
    public boolean isExcluido() {
        return excluido;
    }


    /**
     * Sets the excluido value for this ColetorCusto.
     * 
     * @param excluido
     */
    public void setExcluido(boolean excluido) {
        this.excluido = excluido;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ColetorCusto)) return false;
        ColetorCusto other = (ColetorCusto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.centro_custo==null && other.getCentro_custo()==null) || 
             (this.centro_custo!=null &&
              this.centro_custo.equals(other.getCentro_custo()))) &&
            ((this.ordem_interna==null && other.getOrdem_interna()==null) || 
             (this.ordem_interna!=null &&
              this.ordem_interna.equals(other.getOrdem_interna()))) &&
            ((this.elemento_pep==null && other.getElemento_pep()==null) || 
             (this.elemento_pep!=null &&
              this.elemento_pep.equals(other.getElemento_pep()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            ((this.registro_gestor==null && other.getRegistro_gestor()==null) || 
             (this.registro_gestor!=null &&
              this.registro_gestor.equals(other.getRegistro_gestor()))) &&
            this.id_empresa_totvs == other.getId_empresa_totvs() &&
            ((this.situacao==null && other.getSituacao()==null) || 
             (this.situacao!=null &&
              this.situacao.equals(other.getSituacao()))) &&
            this.excluido == other.isExcluido();
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
        if (getCentro_custo() != null) {
            _hashCode += getCentro_custo().hashCode();
        }
        if (getOrdem_interna() != null) {
            _hashCode += getOrdem_interna().hashCode();
        }
        if (getElemento_pep() != null) {
            _hashCode += getElemento_pep().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        if (getRegistro_gestor() != null) {
            _hashCode += getRegistro_gestor().hashCode();
        }
        _hashCode += getId_empresa_totvs();
        if (getSituacao() != null) {
            _hashCode += getSituacao().hashCode();
        }
        _hashCode += (isExcluido() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ColetorCusto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rd.la.logicalis.com/web-service/coletores-custos", "coletorCusto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("centro_custo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "centro_custo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ordem_interna");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ordem_interna"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elemento_pep");
        elemField.setXmlName(new javax.xml.namespace.QName("", "elemento_pep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registro_gestor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registro_gestor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id_empresa_totvs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id_empresa_totvs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("situacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "situacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excluido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "excluido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
