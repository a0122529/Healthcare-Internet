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
public class DoctorToDoctor extends WorkRequest {
    private int healthcareId;
    private String healthCareName;
    private Patient patient;
    private String doctorName;
    private int doctorId;
    private String entCity;
    private Date date;

    public int getHealthcareId() {
        return healthcareId;
    }

    public void setHealthcareId(int healthcareId) {
        this.healthcareId = healthcareId;
    }

    public String getHealthCareName() {
        return healthCareName;
    }

    public void setHealthCareName(String healthCareName) {
        this.healthCareName = healthCareName;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getEntCity() {
        return entCity;
    }

    public void setEntCity(String entCity) {
        this.entCity = entCity;
    }
    
    @Override
    public String toString(){
      return getStatus();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
