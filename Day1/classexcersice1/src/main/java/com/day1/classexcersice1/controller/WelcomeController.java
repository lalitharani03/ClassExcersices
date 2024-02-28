package com.day1.classexcersice1.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class WelcomeController {
    @GetMapping("/hello")
    public String getName() {
        return new String("Hello World!");
    }
    
}
