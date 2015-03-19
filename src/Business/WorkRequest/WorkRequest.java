/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import Business.Drug.DrugDirectory;
import Business.UserAccount.UserAccount;

/**
 *
 * @author kshitij
 */
public class WorkRequest {
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private String message;
    private  DrugDirectory drugDirectory;
    private int reqId;
    private  static int reqCounter = 3000;

    public WorkRequest(){
        drugDirectory =  new DrugDirectory();
        reqId = reqCounter;
        reqCounter++;
    }  
      
      
    public DrugDirectory getDrugDirectory() {
        return drugDirectory;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getReqId() {
        return reqId;
    }
 
}
