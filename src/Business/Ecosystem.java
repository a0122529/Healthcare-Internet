/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Authority.Authority;
import Business.Enterprise.Enterprise;
import Business.Location.Location;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.HospitalAdminRole;
import Business.Role.PharmaceuticalAdminRole;
import Business.Role.PharmacyAdminRole;
import Business.Role.Role;
import Business.UsernameCheck.UsernameCheckDirectory;
import java.util.ArrayList;

/**
 *
 * @author kshitij
 */
public class Ecosystem extends Organization {

    private ArrayList<Network> networkList;
    private Authority authority;
    private static Ecosystem ecosystem;
    private UsernameCheckDirectory ucd;

    private Ecosystem() {
        super(null);
        networkList = new ArrayList<>();
        authority = new Authority();
        ucd = new UsernameCheckDirectory();
    }

    public static Ecosystem getInstance() {
        if (ecosystem == null) {
            ecosystem = new Ecosystem();
            return ecosystem;
        }
        return ecosystem;
    }

    public ArrayList<Network> getNetworkLst() {
        return networkList;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        for (Network network : ecosystem.getNetworkLst()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Enterprise.EnterpriseType enterpriseType : Enterprise.EnterpriseType.values()) {
                    if (enterpriseType.equals("Hospital") || enterpriseType.equals("Clinic")) {
                        roles.add(new HospitalAdminRole());
                    } else if (enterpriseType.equals("Pharmacy")) {
                        roles.add(new PharmacyAdminRole());
                    } else {
                        roles.add(new PharmaceuticalAdminRole());
                    }
                }
            }
        }
        return roles;
    }

    public Network addNetwork(String city) {
        Network network = new Network();
        network.setName(city);
        networkList.add(network);
        return network;
    }

    public Authority addAuthority(String authName, String emailId, String city) {
        authority.setName(authName);
        authority.setEmailId(emailId);
        Location loc = new Location();
        loc.setCity(city);
        authority.setLocation(loc);
        return authority;
    }

    public UsernameCheckDirectory getUcd() {
        return ucd;
    }

    public void setUcd(UsernameCheckDirectory ucd) {
        this.ucd = ucd;
    }

    public Authority getAuthority() {
        return authority;
    }

    public void setAuthority(Authority authority) {
        this.authority = authority;
    }

    public boolean searchIfPresent(String city) {
        for (Network network : networkList) {
            if (network.getName().equals(city)) {
                return true;
            }
        }
        return false;
    }
}
