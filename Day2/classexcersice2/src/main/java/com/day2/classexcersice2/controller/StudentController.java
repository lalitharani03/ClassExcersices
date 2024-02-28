package com.day2.classexcersice2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.day2.classexcersice2.model.Student;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class StudentController {
    @PostMapping("/stud")
    public String postdetails(@RequestBody Student student) {
        return student.getName()+student.getAge();
        
    }
    
}
