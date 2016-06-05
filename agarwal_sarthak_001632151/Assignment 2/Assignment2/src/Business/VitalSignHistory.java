/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Sarthak
 */
public class VitalSignHistory {
    private Patient patient;
    
    private ArrayList<VitalSign> vitalSignList;
    
    public VitalSignHistory(Patient patient) {
        this.vitalSignList = new ArrayList<VitalSign>();
        this.patient = patient;
    }
    
    public VitalSign addVitalSign() {
        VitalSign vitalSign = new VitalSign(patient); 
        vitalSignList.add(vitalSign);
        return vitalSign;
    }
    
    public void deleteVitalSign(VitalSign vitalSign) {
        vitalSignList.remove(vitalSign);
    }
    
    public ArrayList<VitalSign> getVitalSignList() {
        return vitalSignList;
    }
    
    public void setVitalSignList(ArrayList<VitalSign> vitalSignList) {
        this.vitalSignList = vitalSignList;
    }
}
