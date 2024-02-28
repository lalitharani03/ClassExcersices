package com.day9.classexcersice1.service;
import com.day9.classexcersice1.model.*;
import com.day9.classexcersice1.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepo personRepo;

    public Person addPerson(Person person) {
        return personRepo.save(person);
    }

    public List<Person> getPersonByAge(int age) {
        return personRepo.findByAge(age);
    }
}