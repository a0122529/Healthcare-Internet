/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient.MedicalHistory;

import Business.Disease.Disease;
import Business.Drug.Drug;
import Business.Location.Location;
import Business.Organization.Organization;
import java.util.Date;

/**
 *
 * @author kshitij
 */
public class VitalSignCheck {

    private Disease disease;
    private String status;
    private Drug drug;
    private String healthCareName;
    private String attendantName;
    private String attendantId;
    private Date dateAttended;
    private static int vitalCounter = 2000;
    private int vitalHistId;
    private int respRate;
    private int hRate;
    private int bloodPressure;

    public VitalSignCheck() {
        vitalHistId = vitalCounter;
        vitalCounter++;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    public int getVitalHistId() {
        return vitalHistId;
    }

    public void setVitalHistId(int vitalHistId) {
        this.vitalHistId = vitalHistId;
    }

    public String getHealthCareName() {
        return healthCareName;
    }

    public void setHealthCareName(String healthCareName) {
        this.healthCareName = healthCareName;
    }

    public String getAttendantName() {
        return attendantName;
    }

    public void setAttendantName(String attendantName) {
        this.attendantName = attendantName;
    }

    public String getAttendantId() {
        return attendantId;
    }

    public void setAttendantId(String attendantId) {
        this.attendantId = attendantId;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public int getRespRate() {
        return respRate;
    }

    public void setRespRate(int respRate) {
        this.respRate = respRate;
    }

    public int gethRate() {
        return hRate;
    }

    public void sethRate(int hRate) {
        this.hRate = hRate;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public Date getDateAttended() {
        return dateAttended;
    }

    public void setDateAttended(Date dateAttended) {
        this.dateAttended = dateAttended;
    }
    
    @Override
    public String toString(){
        return status;
    }

}
