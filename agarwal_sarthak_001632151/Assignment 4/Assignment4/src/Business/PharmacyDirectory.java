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
public class PharmacyDirectory {
    private ArrayList<Pharmacy> pharmacyList;

    public PharmacyDirectory() {
        this.pharmacyList = new ArrayList<>();
    }

    public ArrayList<Pharmacy> getPharmacyList() {
        return pharmacyList;
    }

  public Pharmacy addPharmacy(){
        Pharmacy pharmacy = new Pharmacy();
        pharmacyList.add(pharmacy);
        return pharmacy;
    }
    
    public void removePharmacy(Pharmacy pharmacy){
        pharmacyList.remove(pharmacy);
    }
    
    public Pharmacy searchPharmacy(String keyword){
        for (Pharmacy pharmacy : pharmacyList) {
            if(pharmacy.getPharmaName().equals(keyword)){
                return pharmacy;
            }
        }
        return null;
    }
    
    
}
