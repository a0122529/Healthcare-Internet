/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import Business.Patient.Patient;
import java.util.Date;

/**
 *
 * @author kshitij
 */
public class DoctorToNurse extends WorkRequest {

    private String instDoc;
    private String injectionName;
    private int doseLevel;
    private Patient patient;
    private Date date;
    private String complexities;

    public String getInstDoc() {
        return instDoc;
    }

    public void setInstDoc(String instDoc) {
        this.instDoc = instDoc;
    }

    public String getInjectionName() {
        return injectionName;
    }

    public void setInjectionName(String injectionName) {
        this.injectionName = injectionName;
    }

    public int getDoseLevel() {
        return doseLevel;
    }

    public void setDoseLevel(int doseLevel) {
        this.doseLevel = doseLevel;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return getStatus();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getComplexities() {
        return complexities;
    }

    public void setComplexities(String complexities) {
        this.complexities = complexities;
    }

}
