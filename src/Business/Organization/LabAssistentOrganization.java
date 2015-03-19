/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.LabAssistantRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kshitij
 */
public class LabAssistentOrganization extends Organization {

    
    public LabAssistentOrganization() {
        super(Type.Lab.getValue());
    }
    
    
        @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        LabAssistantRole role  = new LabAssistantRole();
        roles.add(role);
        return roles;

    }
   
}
