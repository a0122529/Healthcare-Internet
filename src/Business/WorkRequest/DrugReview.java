/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

/**
 *
 * @author kshitij
 */
public class DrugReview extends WorkRequest {
    
    private String city;
    private String orgType;
    private String orgName;
    private String callBack;
    private String reviews;
    private String replied;
    private String pharmaceutical;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

 
    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

    public String getReplied() {
        return replied;
    }

    public void setReplied(String replied) {
        this.replied = replied;
    }

    public String getPharmaceutical() {
        return pharmaceutical;
    }

    public void setPharmaceutical(String pharmaceutical) {
        this.pharmaceutical = pharmaceutical;
    }
    
    public String toString() {
        return city;
    }

    public String getCallBack() {
        return callBack;
    }

    public void setCallBack(String callBack) {
        this.callBack = callBack;
    }
    
}
