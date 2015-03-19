/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Drug;

import Business.Disease.Disease;
import Business.WorkRequest.WorkQueue;
import java.io.Serializable;

/**
 *
 * @author kshitij
 */
public class Drug  {
    private String drugName;
    private String drugCode;
    private int drugId;
    private static int drugCounter = 10000;
    private String uses;
    private String sideEffects;
    private Disease disease;
    private String status;
    private WorkQueue workQueue;
    private String pharmaceuticalName;
    private int pharmaceuticalId;
    
    public Drug() {
        drugCounter++;
        drugId = drugCounter;
        workQueue = new WorkQueue();
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getSideEffects() {
        return sideEffects;
    }

    public void setSideEffects(String sideEffects) {
        this.sideEffects = sideEffects;
    }

    public String getUses() {
        return uses;
    }

    public void setUses(String uses) {
        this.uses = uses;
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

    public int getDrugId() {
        return drugId;
    }

    public void setDrugId(int drugId) {
        this.drugId = drugId;
    }
    @Override
    public String toString() {
        return getDrugCode();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public String getPharmaceuticalName() {
        return pharmaceuticalName;
    }

    public void setPharmaceuticalName(String pharmaceuticalName) {
        this.pharmaceuticalName = pharmaceuticalName;
    }

    public int getPharmaceuticalId() {
        return pharmaceuticalId;
    }

    public void setPharmaceuticalId(int pharmaceuticalId) {
        this.pharmaceuticalId = pharmaceuticalId;
    }
    
}
