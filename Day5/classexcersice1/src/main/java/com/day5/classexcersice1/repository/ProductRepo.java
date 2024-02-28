package com.day5.classexcersice1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.day5.classexcersice1.model.*;
public interface ProductRepo extends JpaRepository<Product,Integer> {
    
}
