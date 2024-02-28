package com.day1.challengeyourself2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.day1.challengeyourself2.model.College;
@RestController
public class CollegeController {
    @GetMapping("/college")
    public College getdetail(){
        College c=new College("ABC","Computer Science",1);
        return c;
    }
}

