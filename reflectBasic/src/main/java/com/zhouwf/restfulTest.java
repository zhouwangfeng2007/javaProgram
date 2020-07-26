package com.zhouwf;

import com.zhouwf.Utils.RestUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class restfulTest {
    public static void main(String[] args) throws IOException {
        String res = RestUtil.getMethod("http://tcyappsvc.uc108.net/api/selfcheck/checkall");
        System.out.println(res);
        System.out.println("---------------------------------------------------------------");
        res = RestUtil.postMethod("http://tcyappsvc.uc108.net//api/AppV2/GetGameLibrary", "{\"UpDate\":\"\",\"AppList\":[]}");
        System.out.println(res);
    }
}



