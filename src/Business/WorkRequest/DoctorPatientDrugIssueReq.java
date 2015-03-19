/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import java.util.Date;

/**
 *
 * @author kshitij
 */
public class DoctorPatientDrugIssueReq extends WorkRequest{
    
    private Date tDate;
    private String safetyIssue;
    private String callBack;
    private String organizationName;
    private String organizationCity;
    private int organizationId;
    
    
    public DoctorPatientDrugIssueReq(){
        tDate = new Date();
    }

    public Date gettDate() {
        return tDate;
    }

    public void settDate(Date tDate) {
        this.tDate = tDate;
        
    }
    
    @Override
    public String toString(){
        return getStatus();
    }

    public String getSafetyIssue() {
        return safetyIssue;
    }

    public void setSafetyIssue(String safetyIssue) {
        this.safetyIssue = safetyIssue;
    }

    public String getCallBack() {
        return callBack;
    }

    public void setCallBack(String callBack) {
        this.callBack = callBack;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationCity() {
        return organizationCity;
    }

    public void setOrganizationCity(String organizationCity) {
        this.organizationCity = organizationCity;
    }

    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }
}
