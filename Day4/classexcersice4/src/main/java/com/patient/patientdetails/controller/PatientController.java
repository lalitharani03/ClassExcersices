package com.patient.patientdetails.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.module.ResolutionException;
import java.util.List;
import com.patient.patientdetails.model.Patient;
import com.patient.patientdetails.service.PatientService;

@RestController
public class PatientController {
   private PatientService patientService;
    public PatientController(PatientService patientService){
        this.patientService=patientService;
    }  
    @PostMapping("/api/patient")
    public ResponseEntity<Patient> postjobDetails(@RequestBody Patient patient) {
        Patient patientdetail=patientService.saveDetails(patient);
        if(patientdetail!=null)
            return new ResponseEntity<>(patientdetail,HttpStatus.CREATED);
        return new ResponseEntity<>(patientdetail,HttpStatus.INTERNAL_SERVER_ERROR) ;   
    }
    @GetMapping("/api/patient")
    public ResponseEntity<List<Patient>> getlistofjobDetail() {
        List<Patient> li=patientService.listofPatientDetail();
        if(li!=null)
            return new ResponseEntity<>(li,HttpStatus.OK);
        return new ResponseEntity<>(li,HttpStatus.NOT_FOUND);    
    }
    @GetMapping("/api/patient/{patientId}")
    public ResponseEntity<Patient> getpatientById(@PathVariable("patientId") int patientId,Patient patient) {
        Patient j=patientService.patientById(patientId,patient);
        if(j!=null){
        return new ResponseEntity<>(j,HttpStatus.OK);
    }
    else{
            return new ResponseEntity<>(j,HttpStatus.NOT_FOUND);

        }
    }
    
} 