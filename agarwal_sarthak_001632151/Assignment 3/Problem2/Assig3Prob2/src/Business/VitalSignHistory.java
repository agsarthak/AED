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
    private ArrayList<VitalSigns> vitalSignList;
    
    
    public VitalSignHistory(Patient patient) {
        this.vitalSignList = new ArrayList<VitalSigns>();
        this.patient = patient;
    }
    
    public VitalSigns addVitalSign() {
        VitalSigns vitalSigns = new VitalSigns(); 
        vitalSignList.add(vitalSigns);
        return vitalSigns;
    }
    
    public void deleteVitalSign(VitalSigns vitalSigns) {
        vitalSignList.remove(vitalSigns);
    }
    
    public ArrayList<VitalSigns> getVitalSignList() {
        return vitalSignList;
    }
    
    public void setVitalSignList(ArrayList<VitalSigns> vitalSignList) {
        this.vitalSignList = vitalSignList;
    }
    
}
