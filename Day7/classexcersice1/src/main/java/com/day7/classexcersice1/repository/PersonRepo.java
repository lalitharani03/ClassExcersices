package com.day7.classexcersice1.repository;

import com.day7.classexcersice1.model.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepo extends JpaRepository<Person,Integer> {

    List<Person> findAll();

    List<Person> findByAge(int age);

    
}
