/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Person.Person;
import Business.WorkRequest.WorkQueue;

/**
 *
 * @author kshitij
 */
public class Employee extends Person{
    private String emailId;
    private WorkQueue workQueue;
    
    public Employee(){
        workQueue = new WorkQueue();
    }

    public String getEmailId() {
        return emailId;
        
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
                                
    @Override
    public String toString(){   
        return getName();
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

}
