/**
 * SeekCityByIpsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zhouwf;

public class SeekCityByIpsResponse  implements java.io.Serializable {
    private com.zhouwf.IPAresInfo[] seekCityByIpsResult;

    public SeekCityByIpsResponse() {
    }

    public SeekCityByIpsResponse(
           com.zhouwf.IPAresInfo[] seekCityByIpsResult) {
           this.seekCityByIpsResult = seekCityByIpsResult;
    }


    /**
     * Gets the seekCityByIpsResult value for this SeekCityByIpsResponse.
     * 
     * @return seekCityByIpsResult
     */
    public com.zhouwf.IPAresInfo[] getSeekCityByIpsResult() {
        return seekCityByIpsResult;
    }


    /**
     * Sets the seekCityByIpsResult value for this SeekCityByIpsResponse.
     * 
     * @param seekCityByIpsResult
     */
    public void setSeekCityByIpsResult(com.zhouwf.IPAresInfo[] seekCityByIpsResult) {
        this.seekCityByIpsResult = seekCityByIpsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeekCityByIpsResponse)) return false;
        SeekCityByIpsResponse other = (SeekCityByIpsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seekCityByIpsResult==null && other.getSeekCityByIpsResult()==null) || 
             (this.seekCityByIpsResult!=null &&
              java.util.Arrays.equals(this.seekCityByIpsResult, other.getSeekCityByIpsResult())));
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
        if (getSeekCityByIpsResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSeekCityByIpsResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSeekCityByIpsResult(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeekCityByIpsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SeekCityByIpsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seekCityByIpsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SeekCityByIpsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "IPAresInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "IPAresInfo"));
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
