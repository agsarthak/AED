/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BloodSupply;

import java.util.ArrayList;

/**
 *
 * @author Sarthak
 */
public class BLoodSupplyDirectory {
        private ArrayList<BloodSupply> bloodSupplyList;

    public BLoodSupplyDirectory() {
        bloodSupplyList = new ArrayList<>();
    }

    public ArrayList<BloodSupply> getBloodSupplyList() {
        return bloodSupplyList;
    }
    
    public BloodSupply addBloodSupply(){
        BloodSupply bs = new BloodSupply();
        bloodSupplyList.add(bs);
        return bs;
    }
    
    public void removeProduct(BloodSupply bs){
        bloodSupplyList.remove(bs);
    }
    
}
