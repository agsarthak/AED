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
public class DrugCatalog {
    private ArrayList<Drug> drugList;
    
    public DrugCatalog(){
        drugList = new ArrayList<Drug>();
    }

    public ArrayList<Drug> getDrugList() {
        return drugList;
    }
    
    public Drug addDrug(){
        Drug drug = new Drug();
        drugList.add(drug);
        return drug;
    }
    
    public void removeDrug(Drug drug){
        drugList.remove(drug);
    }
    
    public Drug searchDrug(String keyword){
        for (Drug drug : drugList) {
            if(drug.getDrugName().equals(keyword)){
                return drug;
            }
        }
        return null;
    }
    
}
