/**
 * GetAllAreaDataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zhouwf;

public class GetAllAreaDataResponse  implements java.io.Serializable {
    private com.zhouwf.GetAllAreaDataResponseGetAllAreaDataResult getAllAreaDataResult;

    public GetAllAreaDataResponse() {
    }

    public GetAllAreaDataResponse(
           com.zhouwf.GetAllAreaDataResponseGetAllAreaDataResult getAllAreaDataResult) {
           this.getAllAreaDataResult = getAllAreaDataResult;
    }


    /**
     * Gets the getAllAreaDataResult value for this GetAllAreaDataResponse.
     * 
     * @return getAllAreaDataResult
     */
    public com.zhouwf.GetAllAreaDataResponseGetAllAreaDataResult getGetAllAreaDataResult() {
        return getAllAreaDataResult;
    }


    /**
     * Sets the getAllAreaDataResult value for this GetAllAreaDataResponse.
     * 
     * @param getAllAreaDataResult
     */
    public void setGetAllAreaDataResult(com.zhouwf.GetAllAreaDataResponseGetAllAreaDataResult getAllAreaDataResult) {
        this.getAllAreaDataResult = getAllAreaDataResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllAreaDataResponse)) return false;
        GetAllAreaDataResponse other = (GetAllAreaDataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllAreaDataResult==null && other.getGetAllAreaDataResult()==null) || 
             (this.getAllAreaDataResult!=null &&
              this.getAllAreaDataResult.equals(other.getGetAllAreaDataResult())));
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
        if (getGetAllAreaDataResult() != null) {
            _hashCode += getGetAllAreaDataResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAllAreaDataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllAreaDataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllAreaDataResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllAreaDataResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetAllAreaDataResponse>GetAllAreaDataResult"));
        elemField.setMinOccurs(0);
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
