/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import Business.Drug.Drug;
import Business.Patient.Patient;

/**
 *
 * @author kshitij
 */
public class SalesWorkRequest extends WorkRequest {
    
    private Patient patient;
    private Drug drugs;
    private int quantity;
    private String prescribedBy;
    private String disease;
    private int healtcareID;
    private String healthcareName; 

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Drug getDrugs() {
        return drugs;
    }

    public void setDrugs(Drug drugs) {
        this.drugs = drugs;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPrescribedBy() {
        return prescribedBy;
    }

    public void setPrescribedBy(String prescribedBy) {
        this.prescribedBy = prescribedBy;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
    
    @Override
    public  String toString() {
        return String.valueOf(getReqId());
    }

    public int getHealtcareID() {
        return healtcareID;
    }

    public void setHealtcareID(int healtcareID) {
        this.healtcareID = healtcareID;
    }

    public String getHealthcareName() {
        return healthcareName;
    }

    public void setHealthcareName(String healthcareName) {
        this.healthcareName = healthcareName;
    }
}   
