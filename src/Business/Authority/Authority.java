/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Authority;

import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kshitij
 */
public class Authority extends Organization {
    private int authCode;
    private static int authCounter = 0;

    public Authority() {
        super(null);
        authCounter++;
        authCode = authCounter;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public int getAuthCode() {
        return authCode;
    }

    public void setAuthCode(int authCode) {
        this.authCode = authCode;
    }
    @Override
    public String toString(){
        return super.getName();
    }
}
