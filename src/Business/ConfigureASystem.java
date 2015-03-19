/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author kshitij
 */
public class ConfigureASystem {

    public static Ecosystem configure() {
        Ecosystem ecosystem = Ecosystem.getInstance();

        Employee employee = ecosystem.getPersonDirectory().getEmployeeDirectory().createEmployee("joe",
                "street1", "street2", "city", "state", "zip");
        UserAccount userAccount = ecosystem.getUserAccountDirectory().createUserAccount("admin", "admin",
                employee, new SystemAdminRole());
        ecosystem.getUcd().addUsername("admin");

        return ecosystem;
    }
}
