package com.day1.classexcersice4.controller;
import org.springframework.web.bind.annotation.RestController;

import com.day1.classexcersice4.model.Address;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class AddresssController {
    @GetMapping("/address")
    public List<Address> getMethodName() {
        List<Address> address=new ArrayList<Address>();
        Address p=new Address("John", "Welcome, John!");
        address.add(p);
        return address;
    }
    
}
