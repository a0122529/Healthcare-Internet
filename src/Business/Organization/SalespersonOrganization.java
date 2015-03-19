/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SalesPersonRole;
import java.util.ArrayList;

/**
 *
 * @author kshitij
 */
public class SalespersonOrganization extends Organization{
    
    public SalespersonOrganization(){
        super(Type.SalesPerson.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList<>();
        SalesPersonRole role = new SalesPersonRole();
        roles.add(role);
        return roles;
    }
    
}
