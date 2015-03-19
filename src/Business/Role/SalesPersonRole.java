/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Authority.Authority;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.Pharmacy.SalesPersonArea.SalesPersonWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author kshitij
 */
public class SalesPersonRole extends Role{

    public SalesPersonRole() {
        super(RoleType.SalesPerson.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem ecosystem, Authority authority) {
        return new SalesPersonWorkArea(userProcessContainer, account, organization, enterprise, ecosystem);
    }
    
}
