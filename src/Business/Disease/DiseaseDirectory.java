/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Disease;

import java.util.ArrayList;

/**
 *
 * @author kshitij
 */
public class DiseaseDirectory {
    private ArrayList<Disease> diesaseList ;
    
    public DiseaseDirectory() {
        diesaseList = new ArrayList<>();
    }

    public ArrayList<Disease> getDiesaseList() {
        return diesaseList;
    }

    public void setDiesaseList(ArrayList<Disease> diesaseList) {
        this.diesaseList = diesaseList;
    }
    
    public Disease addDiseaseAndSymmptoms(String name, String symptoms){
        Disease disease = new Disease();
        disease.setDiseaseName(name);
        disease.setSymptoms(symptoms);
        diesaseList.add(disease);
        return disease;
    }
}
