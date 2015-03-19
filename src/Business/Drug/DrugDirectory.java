/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Drug;

import Business.Disease.Disease;
import Business.Ecosystem;
import java.util.ArrayList;

/**
 *
 * @author kshitij
 */
public class DrugDirectory {

    private ArrayList<Drug> drugList;

    public DrugDirectory() {
        drugList = new ArrayList<>();
    }

    public ArrayList<Drug> getDrugList() {
        return drugList;
    }

    public void setDrugList(ArrayList<Drug> drugList) {
        this.drugList = drugList;
    }

    public Drug addDrug(String name, String code, String risks, String uses, String diseaseName, String pharmaName, int pharmaId) {
        Drug drug = new Drug();
        drug.setDrugName(name);
        drug.setDrugCode(code);
        drug.setSideEffects(risks);
        drug.setUses(uses);
        drug.setPharmaceuticalName(pharmaName);
        drug.setPharmaceuticalId(pharmaId);
        Disease disease = new Disease();
        disease.setDiseaseName(diseaseName);
        drug.setDisease(disease);
        drugList.add(drug);
   //     Ecosystem.getInstance().getDrugDirectory().drugList.add(drug);
        return drug;
    }
}
