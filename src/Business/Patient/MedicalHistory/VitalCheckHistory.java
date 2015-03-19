/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient.MedicalHistory;

import Business.Disease.Disease;
import Business.Drug.Drug;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author kshitij
 */
public class VitalCheckHistory {
    
    private ArrayList<VitalSignCheck> vitalCheckList;

    public VitalCheckHistory(){
        vitalCheckList = new ArrayList<>();
    }
    
    public VitalSignCheck addVitalSign() {
        VitalSignCheck vs = new VitalSignCheck();
        vitalCheckList.add(vs);
        return vs;
    }

    public ArrayList<VitalSignCheck> getVitalCheckList() {
        return vitalCheckList;
    }

    public void setVitalCheckList(ArrayList<VitalSignCheck> vitalCheckList) {
        this.vitalCheckList = vitalCheckList;
    }
    
    public VitalSignCheck addvitalCheck(String diseasename, String symp, Drug drug,
        Date dateAtt, String status, String attName, int attId, String entName ){
        VitalSignCheck vsc = new VitalSignCheck();
        Disease d = new Disease();
        d.setDiseaseName(diseasename);
        d.setSymptoms(symp);
        vsc.setDisease(d);
        vsc.setDrug(drug);
        vsc.setDateAttended(dateAtt);
        vsc.setStatus(status);
        vsc.setAttendantName(attName);
        vsc.setAttendantId(String.valueOf(attId));
        vsc.setHealthCareName(entName);
        vitalCheckList.add(vsc);
        return vsc;
    }
}
