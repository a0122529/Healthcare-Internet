/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author kshitij
 */
public class Network {
    
    private String name;
    private int cityId;
    private static int cityCounter = 1;
    private EnterpriseDirectory enterpriseDirectory;
    
    public Network() {
        enterpriseDirectory = new EnterpriseDirectory();
        cityId = cityCounter;
        cityCounter++;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
    
    @Override
   public String toString() {
        return name;
    }
}
