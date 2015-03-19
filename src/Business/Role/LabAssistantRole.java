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
import UserInterface.Hospital.LabAssistantArea.LabAssistantWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author kshitij
 */
public class LabAssistantRole extends  Role {

    public LabAssistantRole() {
        super(RoleType.LabAssistant.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, 
            Organization organization, Enterprise enterprise, Ecosystem ecosystem, Authority authority) {
        return new LabAssistantWorkArea(userProcessContainer, ecosystem, account, organization, enterprise);
    }
    
}
