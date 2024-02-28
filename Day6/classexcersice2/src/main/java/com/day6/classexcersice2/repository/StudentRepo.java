package com.day6.classexcersice2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day6.classexcersice2.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer>{
    
    
} 
