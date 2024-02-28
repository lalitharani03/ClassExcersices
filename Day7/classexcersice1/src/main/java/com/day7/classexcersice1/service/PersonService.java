package com.day7.classexcersice1.service;
import com.day7.classexcersice1.repository.*;
import com.day7.classexcersice1.model.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepo personRepo;

    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public Person createPerson(Person person) {
        return personRepo.save(person);
    }

    public List<Person> getAllPersons() {
        return personRepo.findAll();
    }

    public List<Person> getPersonsByAge(int age) {
        return personRepo.findByAge(age);
    }
}
