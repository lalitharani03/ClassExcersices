package com.day1.classexcersice3.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class FavouriteColorController {
    @GetMapping("/fovouriteColor")
    public String getMethodName(String color) {
        return new String("My favorite color is "+color+"!");
    }
    
}
