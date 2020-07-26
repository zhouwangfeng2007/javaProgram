/**
 * SeekCityByListIPResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zhouwf;

public class SeekCityByListIPResponse  implements java.io.Serializable {
    private com.zhouwf.IPAresInfo[] seekCityByListIPResult;

    public SeekCityByListIPResponse() {
    }

    public SeekCityByListIPResponse(
           com.zhouwf.IPAresInfo[] seekCityByListIPResult) {
           this.seekCityByListIPResult = seekCityByListIPResult;
    }


    /**
     * Gets the seekCityByListIPResult value for this SeekCityByListIPResponse.
     * 
     * @return seekCityByListIPResult
     */
    public com.zhouwf.IPAresInfo[] getSeekCityByListIPResult() {
        return seekCityByListIPResult;
    }


    /**
     * Sets the seekCityByListIPResult value for this SeekCityByListIPResponse.
     * 
     * @param seekCityByListIPResult
     */
    public void setSeekCityByListIPResult(com.zhouwf.IPAresInfo[] seekCityByListIPResult) {
        this.seekCityByListIPResult = seekCityByListIPResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeekCityByListIPResponse)) return false;
        SeekCityByListIPResponse other = (SeekCityByListIPResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seekCityByListIPResult==null && other.getSeekCityByListIPResult()==null) || 
             (this.seekCityByListIPResult!=null &&
              java.util.Arrays.equals(this.seekCityByListIPResult, other.getSeekCityByListIPResult())));
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
        if (getSeekCityByListIPResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSeekCityByListIPResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSeekCityByListIPResult(), i);
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
        new org.apache.axis.description.TypeDesc(SeekCityByListIPResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SeekCityByListIPResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seekCityByListIPResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SeekCityByListIPResult"));
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
