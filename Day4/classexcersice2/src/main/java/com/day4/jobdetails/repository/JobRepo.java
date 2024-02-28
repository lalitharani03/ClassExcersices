package com.day4.jobdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day4.jobdetails.model.Job;

public interface JobRepo extends JpaRepository<Job,Integer> {
    
}
