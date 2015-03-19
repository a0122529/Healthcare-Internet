/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Person.Person;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kshitij
 */
public class UserAccountDirectory {

    private ArrayList<UserAccount> userAccountList;

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public UserAccountDirectory() {
        this.userAccountList = new ArrayList<>();
    }

    public UserAccount createUserAccount(String userName, String password, Person person, Role role) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(userName);
        userAccount.setPassword(password);
        userAccount.setPerson(person);
        userAccount.setRole(role);     
        userAccountList.add(userAccount);
        return userAccount;
    }

    public UserAccount authenticateUserLogin(String username, String password) {
        for (UserAccount userAccount : userAccountList) {
            if (userAccount.getUsername().equals(username) && userAccount.getPassword().equals(password)) {
                return userAccount;
            }
        }
        return null;
    }
}
