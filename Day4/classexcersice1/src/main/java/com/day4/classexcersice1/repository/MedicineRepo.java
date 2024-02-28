package com.day4.classexcersice1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.day4.classexcersice1.model.MedicineDetails;

@Repository
public interface MedicineRepo extends JpaRepository<MedicineDetails,Integer> {
    
}
