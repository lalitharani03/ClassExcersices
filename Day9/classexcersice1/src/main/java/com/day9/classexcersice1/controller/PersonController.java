package com.day9.classexcersice1.controller;

import com.day9.classexcersice1.model.*;
import com.day9.classexcersice1.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public ResponseEntity<Person> addPerson(@RequestBody Person person) {
        Person createdPerson = personService.addPerson(person);
        if (createdPerson != null) {
            return new ResponseEntity<>(createdPerson, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/byage/{age}")
    public ResponseEntity<List<Person>> getPersonByAge(@PathVariable int age) {
        List<Person> persons = personService.getPersonByAge(age);
        if (!persons.isEmpty()) {
            return new ResponseEntity<>(persons, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

