/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Location.Location;
import java.util.ArrayList;

/**
 *
 * @author kshitij
 */
public class EmployeeDirectory {

    private ArrayList<Employee> employerList;

    public EmployeeDirectory() {
        employerList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployerList() {
        return employerList;
    }

    public void setEmployerList(ArrayList<Employee> employerList) {
        this.employerList = employerList;
    }

    public Employee createEmployee(String name, String street1, String street2, String city,
            String state, String zip) {
        Employee employee = new Employee();
        employee.setName(name);
        Location loc = new Location();
        loc.setStreetLine1(street1);
        loc.setStreetLine2(street2);
        loc.setCity(city);
        loc.setState(state);
        loc.setZipCode(zip);
        employee.setLocation(loc);
        employerList.add(employee);
        return employee;
    }

    public Employee searchEmp(int id) {
        for (Employee employee : employerList) {
            System.out.println("the doctor id are" + employerList);
            if (employee.getPersonId() == id) {
                return employee;
            }
        }
        return null;
    }
}
