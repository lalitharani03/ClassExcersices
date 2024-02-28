package com.day4.classexcersice1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class MedicineDetails {
    
    @Id
    private int medicineid;

    private String medicineName;
    private String medicineFor;
    private String medicineBrand;
    private String manufacturedIn;
    private double medicinePrice;
    private String expiryDate;

    public MedicineDetails() {
        
    }
    public int getMedicineid() {
        return medicineid;
    }
    public void setMedicineid(int medicineid) {
        this.medicineid = medicineid;
    }
    public String getMedicineName() {
        return medicineName;
    }
    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }
    public String getMedicineFor() {
        return medicineFor;
    }
    public void setMedicineFor(String medicineFor) {
        this.medicineFor = medicineFor;
    }
    public String getMedicineBrand() {
        return medicineBrand;
    }
    public void setMedicineBrand(String medicineBrand) {
        this.medicineBrand = medicineBrand;
    }
    public String getManufacturedIn() {
        return manufacturedIn;
    }
    public void setManufacturedIn(String manufacturedIn) {
        this.manufacturedIn = manufacturedIn;
    }
    public double getMedicinePrice() {
        return medicinePrice;
    }
    public void setMedicinePrice(double medicinePrice) {
        this.medicinePrice = medicinePrice;
    }
    public String getExpiryDate() {
        return expiryDate;
    }
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
    
}
