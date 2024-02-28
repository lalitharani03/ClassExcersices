package com.day4.classexcersice1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day4.classexcersice1.model.MedicineDetails;
import com.day4.classexcersice1.repository.MedicineRepo;

@Service
public class MedicineService {
    @Autowired
    private MedicineRepo medicineRepo;
    public MedicineService(MedicineRepo medicineRepo){
         this.medicineRepo=medicineRepo;
    }
    public MedicineDetails saveMedicine(MedicineDetails medicine){
        return medicineRepo.save(medicine);
    }
    public List<MedicineDetails> listofMedicine(){
        return medicineRepo.findAll();
    }
    public MedicineDetails objectMedicine(int medicineid){
        Optional<MedicineDetails> obj=medicineRepo.findById(medicineid);
        return obj.orElse(new MedicineDetails());
    }
}
