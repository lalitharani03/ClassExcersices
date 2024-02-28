package com.day1.challengeyourself1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.day1.challengeyourself1.model.Family;
import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class FamilyController {
    @GetMapping("/family")
    public List<Family> getlist() {
        List<Family>li=new ArrayList<Family>();
        Family f=new Family("John", 20, "Brother");
        li.add(f);
        Family fa=new Family("Joe",20,"Brother");
        li.add(fa);
        return li;
    }
    
}
