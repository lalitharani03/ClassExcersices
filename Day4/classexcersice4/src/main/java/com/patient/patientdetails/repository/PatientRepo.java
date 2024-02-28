package com.patient.patientdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patient.patientdetails.model.Patient;

public interface PatientRepo extends JpaRepository<Patient,Integer>{
    
}
