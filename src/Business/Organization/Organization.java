/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Drug.DrugDirectory;
import Business.Location.Location;
import Business.Person.PersonDirectory;
import Business.PharmacyProduct.ProductDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkRequest.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author kshitij
 */
public abstract class Organization {

    private String name;
    private PersonDirectory personDirectory;
    private Role role;
    private UserAccountDirectory userAccountDirectory;
    private WorkQueue workQueue;
    private int organizationID;
    private static int counter;
    private Location location;
    private String emailId;
    private DrugDirectory drugDirectory;
    private ProductDirectory productDirectory; 

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        personDirectory = new PersonDirectory();
        userAccountDirectory = new UserAccountDirectory();
        drugDirectory = new DrugDirectory();
        productDirectory = new ProductDirectory();
        location = new Location();
       
        organizationID = counter;
        ++counter;

    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public DrugDirectory getDrugDirectory() {
        return drugDirectory;
    }

    public void setDrugDirectory(DrugDirectory drugDirectory) {
        this.drugDirectory = drugDirectory;
    }

    public enum Type {

        Doctor("Doctor Organization"),
        Lab("Lab Organization"),
        Nurse("Nurse Organization"),
        Patient("Patient Organization"),
        SalesPerson("Salesperson Organization"),
        MedManager("Medicine Representative");

        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public abstract ArrayList<Role> getSupportedRole();

    public String toString(){
        return getName();
    }
}
