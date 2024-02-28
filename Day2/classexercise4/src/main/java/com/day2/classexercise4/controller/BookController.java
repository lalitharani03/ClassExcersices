package com.day2.classexercise4.controller;
import org.springframework.web.bind.annotation.RestController;

import com.day2.classexercise4.model.Book;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class BookController {
    @GetMapping("/book")
    public Book getdetails() {
        Book b=new Book("The Great Soldier", "G. Gyan", new Date());
        return b;
    }
    
}
