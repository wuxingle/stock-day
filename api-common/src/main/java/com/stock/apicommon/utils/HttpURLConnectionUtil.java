package com.stock.apicommon.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionUtil {

    public static String httpURLConnection(String requestUrl) throws IOException {
        //生成URL的
        URL getUrl = new URL(requestUrl);
        //HTTP通讯连接打开
        HttpURLConnection connection = (HttpURLConnection) getUrl.openConnection();
        //建立连接
        connection.connect();
        //获取连接流
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
        StringBuffer lines = new StringBuffer();
        String line;
        while ((line = reader.readLine()) != null) {
            lines.append(line);
        }
        reader.close();
        // 断开连接
        connection.disconnect();
        return lines.toString();
    }
}
