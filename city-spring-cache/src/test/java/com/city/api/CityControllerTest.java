package com.city.api;

import com.city.util.HttpUtil;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class CityControllerTest {


    @Test
    public void beijing() throws UnsupportedEncodingException {
        String name = URLEncoder.encode("北京","utf-8");
        String url = "http://127.0.0.1:8080/api/get/"+name;
        long start = System.currentTimeMillis();
        for (int i = 0 ; i < 50 ; i++){
            String result = HttpUtil.get(url);
        }
        System.out.println("beijing  time : "+(System.currentTimeMillis() - start));
    }

    @Test
    public void shanghai() throws UnsupportedEncodingException {
        String name = URLEncoder.encode("上海","utf-8");
        String url = "http://127.0.0.1:8080/api/get/"+name;
        long start = System.currentTimeMillis();
        for (int i = 0 ; i < 40 ; i++){
            String result = HttpUtil.get(url);
        }
        System.out.println("shanghai  time : "+(System.currentTimeMillis() - start));
    }

    @Test
    public void guangzhou() throws UnsupportedEncodingException {
        String name = URLEncoder.encode("广州","utf-8");
        String url = "http://127.0.0.1:8080/api/get/"+name;
        long start = System.currentTimeMillis();
        for (int i = 0 ; i < 30 ; i++){
            String result = HttpUtil.get(url);
        }
        System.out.println("guangzhou  time : "+(System.currentTimeMillis() - start));
    }

    @Test
    public void shenzhen() throws UnsupportedEncodingException {
        String name = URLEncoder.encode("深圳","utf-8");
        String url = "http://127.0.0.1:8080/api/get/"+name;
        long start = System.currentTimeMillis();
        for (int i = 0 ; i < 20 ; i++){
            String result = HttpUtil.get(url);
        }
        System.out.println("shenzhen  time : "+(System.currentTimeMillis() - start));
    }

    @Test
    public void jieyang() throws UnsupportedEncodingException {
        String name = URLEncoder.encode("揭阳","utf-8");
        String url = "http://127.0.0.1:8080/api/get/"+name;
        long start = System.currentTimeMillis();
        for (int i = 0 ; i < 10 ; i++){
            String result = HttpUtil.get(url);
        }
        System.out.println("jieyang  time : "+(System.currentTimeMillis() - start));
    }


    @Test
    public void beijingCache() throws UnsupportedEncodingException {
        String name = URLEncoder.encode("北京","utf-8");
        String url = "http://127.0.0.1:8080/api/getCache/"+name;
        long start = System.currentTimeMillis();
        for (int i = 0 ; i < 50 ; i++){
            String result = HttpUtil.get(url);
        }
        System.out.println("beijingCache  time : "+(System.currentTimeMillis() - start));
    }

    @Test
    public void shanghaiCache() throws UnsupportedEncodingException {
        String name = URLEncoder.encode("上海","utf-8");
        String url = "http://127.0.0.1:8080/api/getCache/"+name;
        long start = System.currentTimeMillis();
        for (int i = 0 ; i < 40 ; i++){
            String result = HttpUtil.get(url);
        }
        System.out.println("shanghaiCache  time : "+(System.currentTimeMillis() - start));
    }

    @Test
    public void guangzhouCache() throws UnsupportedEncodingException {
        String name = URLEncoder.encode("广州","utf-8");
        String url = "http://127.0.0.1:8080/api/getCache/"+name;
        long start = System.currentTimeMillis();
        for (int i = 0 ; i < 30 ; i++){
            String result = HttpUtil.get(url);
        }
        System.out.println("guangzhouCache  time : "+(System.currentTimeMillis() - start));
    }

    @Test
    public void shenzhenCache() throws UnsupportedEncodingException {
        String name = URLEncoder.encode("深圳","utf-8");
        String url = "http://127.0.0.1:8080/api/getCache/"+name;
        long start = System.currentTimeMillis();
        for (int i = 0 ; i < 20 ; i++){
            String result = HttpUtil.get(url);
        }
        System.out.println("shenzhenCache  time : "+(System.currentTimeMillis() - start));
    }

    @Test
    public void jieyangCache() throws UnsupportedEncodingException {
        String name = URLEncoder.encode("揭阳","utf-8");
        String url = "http://127.0.0.1:8080/api/getCache/"+name;
        long start = System.currentTimeMillis();
        for (int i = 0 ; i < 10 ; i++){
            String result = HttpUtil.get(url);
        }
        System.out.println("jieyangCache  time : "+(System.currentTimeMillis() - start));
    }

}
