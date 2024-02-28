package com.day4.classexcersice1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.day4.classexcersice1.model.MedicineDetails;
import com.day4.classexcersice1.services.MedicineService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
// import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class MedicineController {
    @Autowired
    private MedicineService medicineService;
    public MedicineController(MedicineService medicineService){
         this.medicineService=medicineService;
    }

    @PostMapping("/api/medicine")
    public ResponseEntity<MedicineDetails> postMedicine(@RequestBody MedicineDetails medicine) {
            MedicineDetails Medicine=medicineService.saveMedicine(medicine);
            return new ResponseEntity<>(Medicine,HttpStatus.CREATED);
    }

    @GetMapping("/api/medicines")
    public ResponseEntity<List<MedicineDetails>> getlistofMedicine() {
          List<MedicineDetails> li=medicineService.listofMedicine();
          return new ResponseEntity<>(li,HttpStatus.OK);
    }
    
    @GetMapping("/api/medicine/{medicineid}")
    public ResponseEntity<MedicineDetails> getobjectMedicine(@PathVariable("medicineid") int medicineid) {
        MedicineDetails med=medicineService.objectMedicine(medicineid);
        if(med!=null){
            return new ResponseEntity<>(med,HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
}
