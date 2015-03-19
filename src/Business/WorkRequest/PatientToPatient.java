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
public class PatientToPatient extends WorkRequest{
    
    @Override
    public String toString() {
        return getSender().getPerson().getName();
    }
     
    
    
}
