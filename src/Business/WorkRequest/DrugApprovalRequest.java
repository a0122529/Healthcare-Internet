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
public class DrugApprovalRequest extends WorkRequest{

    private String companyName;
    private int companyId;
    private String drugReqCode;
    
    
    @Override
    public String toString(){
        return getStatus();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getDrugReqCode() {
        return drugReqCode;
    }

    public void setDrugReqCode(String drugReqCode) {
        this.drugReqCode = drugReqCode;
    }

}
