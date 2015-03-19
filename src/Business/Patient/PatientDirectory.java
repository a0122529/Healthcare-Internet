/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Ecosystem;
import Business.Location.Location;
import java.util.ArrayList;

/**
 *
 * @author kshitij
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patientList;
    private Patient patient;

    public PatientDirectory() {
        patientList = new ArrayList<>();
    }
    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    
    public Patient addPatient(String name, String sex,String dob, String Email, int age, String street1, String street2,
     String city, String state, String zip, String priDocName, int priDocId) {
        patient = new Patient();
        patient.setName(name);
        patient.setSex(sex);
        patient.setEmailId(Email);
        patient.setAge(age);
        patient.setDob(dob);
        patient.setPrimaryDoc(priDocName);
        patient.setPrimaryDocId(priDocId);
        Location loc = new Location();       
        loc.setStreetLine1(street1);
        loc.setStreetLine2(street2);
        loc.setCity(city);
        loc.setState(state);
        loc.setZipCode(zip);
        patient.setLocation(loc);
        patientList.add(patient);
        Ecosystem.getInstance().getPersonDirectory().getPatientDirectory().getPatientList().add(patient);
        
        return patient;    
    }
    
    public Patient searchPatient(int patID){
        for(Patient patient : patientList){
            if(patient.getPatientId() == patID){
                return patient;
            }
        }
        return null;
    }
    
    public Boolean searchIfPresentinSame(int info){
             for (Patient patient : patientList) {
            if (patient.getPatientId() == info) {
                return true;
            }
        }
        return false;
    }  
}
