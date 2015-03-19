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
import javax.swing.JPanel;

/**
 *
 * @author kshitij
 */
public abstract class Role {
    private String name;
    
    public Role(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 
     public enum RoleType{
        Nurse("Nurse"),
        Doctor("Doctor"),
        LabAssistant("Lab Assistant"),
        SalesPerson("Sales Person"),
        MedRep("Medical Representative");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, 
            Organization organization,Enterprise enterprise, Ecosystem ecosystem, Authority authority);

    @Override
    public String toString() {
        return getName();
    }
}
