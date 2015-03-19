/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kshitij
 */
public class DoctorOrganization extends Organization {

    public DoctorOrganization() {
        super(Type.Doctor.getValue());

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        DoctorRole role = new DoctorRole();
        roles.add(role);
        return roles;
    }
    
    @Override
    public String toString(){
        return getName();
    }
}
