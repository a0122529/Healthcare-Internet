/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kshitij
 */
public class PharmaceuticalEnterprise extends Enterprise {

    
    public  PharmaceuticalEnterprise(String name, EnterpriseType enterpriseType,
  String street1, String street2,String state, String city, String zip  ) {
        super(name, enterpriseType);
        
        
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
