package com.city.controller;

import com.city.service.CityService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api")
public class CityController {

    @Resource
    public CityService cityService;

    @RequestMapping("/getCache/{city}")
    @ResponseBody
    public String getCache(@PathVariable("city") String city){
        return cityService.getCache(city);
    }

    @RequestMapping("/get/{city}")
    @ResponseBody
    public String get(@PathVariable("city") String city){
        return cityService.get(city);
    }
}
