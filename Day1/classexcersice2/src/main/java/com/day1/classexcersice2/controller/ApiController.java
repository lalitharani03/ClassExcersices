package com.day1.classexcersice2.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class ApiController {
    @GetMapping("/studentName")    
    public String getMethodName(String studentName) {
        return new String("Welcome"+studentName+"!");
    }
    
}
