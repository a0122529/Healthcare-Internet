/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Disease;

/**
 *
 * @author kshitij
 */
public class Disease {
    public static final String Hepatitis = "Hepatitis";
    public static final String Asthma = "Asthma Disease";
    public static final String Leprosy = "Leprosy";
    public static final String Cholera = "Cholera";
    public static final String Ebola = "Ebola";
    
            
    private String diseaseName;
    private String symptoms;

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }
}
