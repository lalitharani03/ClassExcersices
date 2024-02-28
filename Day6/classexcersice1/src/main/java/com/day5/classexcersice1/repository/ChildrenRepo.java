package com.day5.classexcersice1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day5.classexcersice1.model.Children;

public interface ChildrenRepo extends JpaRepository<Children,Integer> {
    
}
