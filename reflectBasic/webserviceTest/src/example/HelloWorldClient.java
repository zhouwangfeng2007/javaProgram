package example;


import com.zhouwf.GetAllProvinceResponseGetAllProvinceResult;
import com.zhouwf.GetCityByProvinceIDResponseGetCityByProvinceIDResult;
import com.zhouwf.GetDistrictByCityIDResponseGetDistrictByCityIDResult;
import com.zhouwf.IPAreaServiceLocator;
import org.apache.axis.message.MessageElement;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringReader;

public class HelloWorldClient {
    public static void main(String[] argv) {
        Test1();
        Test2();
        Test3();
    }


    public static void Test3() {
        try {
            IPAreaServiceLocator locator = new IPAreaServiceLocator();
            locator.setIPAreaServiceSoapEndpointAddress("http://ipas.uc108.net/IPAreaService.asmx");
            GetDistrictByCityIDResponseGetDistrictByCityIDResult result = locator.getIPAreaServiceSoap().getDistrictByCityID("0601");
            MessageElement[] meArray = result.get_any();
            String xmlStr = meArray[1].toString();

            StringReader sr = new StringReader(xmlStr);
            InputSource is = new InputSource(sr);
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(is);
            NodeList nList = doc.getElementsByTagName("Table");
            Integer a = nList.getLength();
            for (int i = 0; i < nList.getLength(); i++) {
                Element ele = (Element) nList.item(i);
                System.out.println(ele.getElementsByTagName("DistrictID").item(0).getTextContent());
                System.out.println(ele.getElementsByTagName("DistrictName").item(0).getTextContent());
            }
        } catch (javax.xml.rpc.ServiceException ex) {
            ex.printStackTrace();
        } catch (java.rmi.RemoteException ex) {
            ex.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void Test2() {
        try {
            IPAreaServiceLocator locator = new IPAreaServiceLocator();
            locator.setIPAreaServiceSoapEndpointAddress("http://ipas.uc108.net/IPAreaService.asmx");
            GetCityByProvinceIDResponseGetCityByProvinceIDResult result = locator.getIPAreaServiceSoap().getCityByProvinceID("06");
            MessageElement[] meArray = result.get_any();
            String xmlStr = meArray[1].toString();

            StringReader sr = new StringReader(xmlStr);
            InputSource is = new InputSource(sr);
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(is);
            NodeList nList = doc.getElementsByTagName("Table");

            for (int i = 0; i < nList.getLength(); i++) {
                Element ele = (Element) nList.item(i);
                System.out.println(ele.getElementsByTagName("CityID").item(0).getTextContent());
                System.out.println(ele.getElementsByTagName("CityName").item(0).getTextContent());
            }
        } catch (javax.xml.rpc.ServiceException ex) {
            ex.printStackTrace();
        } catch (java.rmi.RemoteException ex) {
            ex.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void Test1() {
        try {
            IPAreaServiceLocator locator = new IPAreaServiceLocator();
            locator.setIPAreaServiceSoapEndpointAddress("http://ipas.uc108.net/IPAreaService.asmx");
            GetAllProvinceResponseGetAllProvinceResult result = locator.getIPAreaServiceSoap().getAllProvince();
            MessageElement[] meArray = result.get_any();
            String xmlStr = meArray[1].toString();

            StringReader sr = new StringReader(xmlStr);
            InputSource is = new InputSource(sr);
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(is);
            NodeList nList = doc.getElementsByTagName("Table");

            for (int i = 0; i < nList.getLength(); i++) {
                Element ele = (Element) nList.item(i);
                System.out.println(ele.getElementsByTagName("ProvinceID").item(0).getTextContent());
                System.out.println(ele.getElementsByTagName("ProvinceName").item(0).getTextContent());
            }
        } catch (javax.xml.rpc.ServiceException ex) {
            ex.printStackTrace();
        } catch (java.rmi.RemoteException ex) {
            ex.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
