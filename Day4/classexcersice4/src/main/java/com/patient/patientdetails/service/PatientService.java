package com.patient.patientdetails.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.patient.patientdetails.model.Patient;
import com.patient.patientdetails.repository.PatientRepo;

@Service
public class PatientService {
    private PatientRepo patientRepo;
    public PatientService(PatientRepo patientRepo){
        this.patientRepo=patientRepo;
    }
    public Patient saveDetails(Patient patient){
        return patientRepo.save(patient);
        
}

public List<Patient> listofPatientDetail(){
       return patientRepo.findAll();
}

public Patient patientById(int jobId,Patient job){
      return patientRepo.findById(jobId).orElse(new Patient());
}
}
