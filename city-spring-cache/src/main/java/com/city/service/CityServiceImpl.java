package com.city.service;

import com.city.util.HttpUtil;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service("cityService")
public class CityServiceImpl implements CityService{

    private final static String url = "http://wthrcdn.etouch.cn/weather_mini?city=";

    @Override
    @Cacheable(sync = true,key = "#city",cacheNames = "city")
    public String getCache(String city) {
        return getCity(city);
    }

    @Override
    public String get(String city) {
        return getCity(city);
    }


    private String getCity(String city){
        String result = HttpUtil.sendGet(url + city);
        System.out.println(result);
        return result;
    }
}
