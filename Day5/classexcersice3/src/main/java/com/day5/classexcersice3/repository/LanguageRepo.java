package com.day5.classexcersice3.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.day5.classexcersice3.model.*;

public interface LanguageRepo extends JpaRepository<Language, Integer> {
    
}


