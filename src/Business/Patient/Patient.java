/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Patient.MedicalHistory.VitalCheckHistory;
import Business.Person.Person;
import Business.WorkRequest.WorkQueue;
import java.util.Date;

/**
 *
 * @author kshitij
 */
public class Patient extends Person {
    public static final String male = "Male";
    public static final String female = "Female";
    
    private int patientId;
    private static int patCount = 1000;
    private String dob;
    private String sex;
    private VitalCheckHistory vitalCheckHistory;
    private int age;
    private String emailId;
    private WorkQueue workQueue;
    private String primaryDoc;
    private int primaryDocId;


    public Patient() {
        patCount++;
        patientId = patCount;        
        vitalCheckHistory = new VitalCheckHistory();
        workQueue = new WorkQueue();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public VitalCheckHistory getVitalCheckHistory() {
        return vitalCheckHistory;
    }

    public void setVitalCheckHistory(VitalCheckHistory vitalCheckHistory) {
        this.vitalCheckHistory = vitalCheckHistory;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }


    @Override
    public String toString() {
        return getName();
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public String getPrimaryDoc() {
        return primaryDoc;
    }

    public void setPrimaryDoc(String primaryDoc) {
        this.primaryDoc = primaryDoc;
    }

    public int getPrimaryDocId() {
        return primaryDocId;
    }

    public void setPrimaryDocId(int primaryDocId) {
        this.primaryDocId = primaryDocId;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }


  
}
