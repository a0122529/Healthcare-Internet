/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UsernameCheck;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author kshitij
 */
public class UsernameCheckDirectory {

    private ArrayList<UsernameCheck> usernameList;

    public UsernameCheckDirectory() {
        usernameList = new ArrayList<>();
    }

    public ArrayList<UsernameCheck> getUsernameList() {
        return usernameList;
    }

    public void setUsernameList(ArrayList<UsernameCheck> usernameList) {
        this.usernameList = usernameList;
    }

    public void addUsername(String username) {
        UsernameCheck uc = new UsernameCheck();
        uc.setUsername(username);
        usernameList.add(uc);
    }

    public String validUsernameCheck(String username) {
        for (UsernameCheck uc : usernameList) {
            if (uc.getUsername().equals(username)) {
                return null;
            }
        }
        return username;
    }
}
