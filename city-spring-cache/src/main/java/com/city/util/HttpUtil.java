package com.city.util;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class HttpUtil {

    /*
      get方式访问网址
    */
    public static String sendGet(String url) {
        String result = "";
        try {
            String urlName = url;
            URL realUrl = new URL(urlName);
            //打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            //设置通用的请求属性
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent","Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
            //建立实际的连接
            conn.connect();
            //定义BufferedReader输入流来读取URL的响应
            InputStream input = conn.getInputStream();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int n;
            while((n = input.read(buffer)) > 0){
                baos.write(buffer,0,n);
            }
            baos.flush();
            result = GzipUtil.uncompressToString(baos.toByteArray(),"utf-8");
            input.close();
            baos.close();
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        return result;
    }


    /*
      get方式访问网址
    */
    public static String get(String url) {
        String result = "";
        try {
            String urlName = url;
            URL realUrl = new URL(urlName);
            //打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            //设置通用的请求属性
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent","Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
            //建立实际的连接
            conn.connect();
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null){
                result += line;
            }
            in.close();
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        return result;
    }
}
