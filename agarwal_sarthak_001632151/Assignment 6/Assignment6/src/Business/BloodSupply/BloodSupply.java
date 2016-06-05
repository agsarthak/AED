/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BloodSupply;

import Business.Employee.Employee;

/**
 *
 * @author Sarthak
 */
public class BloodSupply {
    private Employee donor;
    private String bloodType;
    private String dateofBloodTaken;
    private String barCode;

    public Employee getDonor() {
        return donor;
    }

    public void setDonor(Employee donor) {
        this.donor = donor;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getDateofBloodTaken() {
        return dateofBloodTaken;
    }

    public void setDateofBloodTaken(String dateofBloodTaken) {
        this.dateofBloodTaken = dateofBloodTaken;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    
}
