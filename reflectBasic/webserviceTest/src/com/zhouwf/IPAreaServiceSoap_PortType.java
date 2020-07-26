/**
 * IPAreaServiceSoap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zhouwf;

public interface IPAreaServiceSoap_PortType extends java.rmi.Remote {
    public com.zhouwf.GetAllProvinceResponseGetAllProvinceResult getAllProvince() throws java.rmi.RemoteException;
    public com.zhouwf.GetCityByProvinceIDResponseGetCityByProvinceIDResult getCityByProvinceID(java.lang.String provinceID) throws java.rmi.RemoteException;
    public com.zhouwf.GetDistrictByCityIDResponseGetDistrictByCityIDResult getDistrictByCityID(java.lang.String cityID) throws java.rmi.RemoteException;
    public com.zhouwf.GetAllAreaDataResponseGetAllAreaDataResult getAllAreaData() throws java.rmi.RemoteException;
    public com.zhouwf.GetAllDistrictAreaResponseGetAllDistrictAreaResult getAllDistrictArea() throws java.rmi.RemoteException;
    public void seekCityByIP(java.lang.String ip, javax.xml.rpc.holders.BooleanHolder seekCityByIPResult, javax.xml.rpc.holders.StringHolder cityID, javax.xml.rpc.holders.StringHolder cityName, javax.xml.rpc.holders.StringHolder ispID, javax.xml.rpc.holders.StringHolder ispName, javax.xml.rpc.holders.StringHolder provinceID, javax.xml.rpc.holders.StringHolder provinceName) throws java.rmi.RemoteException;
    public com.zhouwf.IPAresInfo[] seekCityByListIP(java.lang.String[] listIP) throws java.rmi.RemoteException;
    public com.zhouwf.IPAresInfo[] seekCityByIps(java.lang.String[] listIP) throws java.rmi.RemoteException;
    public void seekCityByPhone(java.lang.String phone, javax.xml.rpc.holders.BooleanHolder seekCityByPhoneResult, javax.xml.rpc.holders.StringHolder cityID, javax.xml.rpc.holders.StringHolder cityName, javax.xml.rpc.holders.StringHolder provinceID, javax.xml.rpc.holders.StringHolder provinceName, javax.xml.rpc.holders.StringHolder cardP) throws java.rmi.RemoteException;
    public com.zhouwf.GetAllIPListResponseGetAllIPListResult getAllIPList() throws java.rmi.RemoteException;
    public void getIPInfoByIP(java.lang.String ip, com.zhouwf.holders.IPInfoHolder getIPInfoByIPResult, javax.xml.rpc.holders.StringHolder msg) throws java.rmi.RemoteException;
}
