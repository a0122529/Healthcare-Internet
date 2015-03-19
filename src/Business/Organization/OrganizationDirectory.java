/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author kshitij
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }

    public Organization addOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Doctor.getValue())) {
            organization = new DoctorOrganization();
            organizationList.add(organization);
            return organization;
        } else if (type.getValue().equals(Organization.Type.Lab.getValue())) {
            organization = new LabAssistentOrganization();
            organizationList.add(organization);
            return organization;
        } else if (type.getValue().equals(Organization.Type.Nurse.getValue())) {
            organization = new NurseOrganization();
            organizationList.add(organization);
            return organization;
        } else if (type.getValue().equals(Organization.Type.Patient.getValue())) {
            organization = new PatientOrganization();
            organizationList.add(organization);
            return organization;
        } else if (type.getValue().equals(Organization.Type.SalesPerson.getValue())) {
            organization = new SalespersonOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.MedManager.getValue())) {
            organization = new MedRepOrganization();
            organizationList.add(organization);
        }
        return organization;
    }

    public boolean searchIfPresent(Type type) {
        for (Organization org : organizationList) {
            if (org.getName().equals(type.getValue())) {
                return true;
            }
        }
        return false;
    }
}
