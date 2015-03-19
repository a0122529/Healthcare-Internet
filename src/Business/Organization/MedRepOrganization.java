/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.MedicineRepresentativeRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kshitij
 */
public class MedRepOrganization extends Organization {
    
    public  MedRepOrganization() {
        super(Type.MedManager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList<>();
        MedicineRepresentativeRole role = new MedicineRepresentativeRole();
        roles.add(role);
        return roles;
    }
    
    
}
