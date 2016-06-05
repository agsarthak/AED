/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BloodSupply;

import Business.WorkQueue.LabTestWorkRequest;

/**
 *
 * @author Sarthak
 */
public class BloodSupplyWorkRequest extends LabTestWorkRequest{
    
    private BloodSupply bloodSupply;

    public BloodSupply getBloodSupply() {
        return bloodSupply;
    }

    public void setBloodSupply(BloodSupply bloodSupply) {
        this.bloodSupply = bloodSupply;
    }
    
    
}
