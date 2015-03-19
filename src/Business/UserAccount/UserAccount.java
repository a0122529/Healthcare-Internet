/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Patient.Patient;
import Business.Person.Person;
import Business.Role.Role;
import Business.WorkRequest.WorkQueue;

/**
 *
 * @author kshitij
 */
public class UserAccount {
    private String username;
    private String password;
    private Person person;
    private Role role;
    private Patient patient;
    private WorkQueue workQueue;

    public String getUsername() {
        return username;
    }

    public UserAccount() {
        this.workQueue = new WorkQueue();
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    @Override
    public String toString(){
        return  getPerson().getName();// change all the name to id in user account as i am converting string to tring from
                                                            // from name to id
    }
}
