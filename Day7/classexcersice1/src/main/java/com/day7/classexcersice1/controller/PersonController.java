package com.day7.classexcersice1.controller;
import com.day7.classexcersice1.model.*;
import com.day7.classexcersice1.service.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public ResponseEntity<Person> createPerson(@RequestBody Person person) {
        Person createdPerson = personService.createPerson(person);
        return new ResponseEntity<>(createdPerson, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Person>> getAllPersons() {
        List<Person> persons = personService.getAllPersons();
        return new ResponseEntity<>(persons, HttpStatus.OK);
    }

    @GetMapping("/byAge")
    public ResponseEntity<List<Person>> getPersonsByAge(@RequestParam int age) {
        List<Person> personsByAge = personService.getPersonsByAge(age);
        return new ResponseEntity<>(personsByAge, HttpStatus.OK);
    }
}
