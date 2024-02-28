package com.classexcersice.day2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.classexcersice.day2.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ApiController {
    @Autowired
     AppConfig appConfig;

    @GetMapping("/info")
    public String getApp() {
        return new String("App Name:"+appConfig.getAppName()+",Vesion:"+appConfig.getAppVersion());
    }
    
}
