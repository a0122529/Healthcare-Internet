/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Location.Location;
import java.util.ArrayList;

/**
 *
 * @author kshitij
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public void addEnterprise(String name, Enterprise.EnterpriseType enterpriseType,
            String street1, String street2, String state, String city, String zip) {
        Enterprise enterprise = null;
        Location location = null;
        if (enterpriseType.equals(Enterprise.EnterpriseType.Hospital)) {
            enterprise = new HospitalEnterprise(name, enterpriseType, street1, street2, state, city, zip);
            location = new Location();
            location.setStreetLine1(street1);
            location.setStreetLine2(street2);
            location.setState(state);
            location.setCity(city);
            location.setZipCode(zip);
            enterprise.setLocation(location);
            enterpriseList.add(enterprise);
        } else if (enterpriseType.equals(Enterprise.EnterpriseType.Clinic)) {
            enterprise = new ClinicEnterprise(name, enterpriseType, street1, street2, state, city, zip);
            location = new Location();
            location.setStreetLine1(street1);
            location.setStreetLine2(street2);
            location.setState(state);
            location.setCity(city);
            location.setZipCode(zip);
            enterprise.setLocation(location);
            enterpriseList.add(enterprise);
        } else if (enterpriseType.equals(Enterprise.EnterpriseType.Pharmaceutical)) {
            enterprise = new PharmaceuticalEnterprise(name, enterpriseType, street1, street2, state, city, zip);
            location = new Location();
            location.setStreetLine1(street1);
            location.setStreetLine2(street2);
            location.setState(state);
            location.setCity(city);
            location.setZipCode(zip);
            enterprise.setLocation(location);
            enterpriseList.add(enterprise);
        } else if (enterpriseType.equals(Enterprise.EnterpriseType.Pharmacy)) {
            enterprise = new PharmacyEnterprise(name, enterpriseType, street1, street2, state, city, zip);
            location = new Location();
            location.setStreetLine1(street1);
            location.setStreetLine2(street2);
            location.setState(state);
            location.setCity(city);
            location.setZipCode(zip);
            enterprise.setLocation(location);
            enterpriseList.add(enterprise);
        }
    }
}
