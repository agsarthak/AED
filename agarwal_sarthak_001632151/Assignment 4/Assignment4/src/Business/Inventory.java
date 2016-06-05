/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Sarthak
 */
public class Inventory {

    private String serialNumber;
    private String expirationDate;
    private int qty;
    private Drug drug;
    private String qtyThreshold;
    private String stockStatus;
    
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public String getQtyThreshold() {
        return qtyThreshold;
    }

    public void setQtyThreshold(String qtyThreshold) {
        this.qtyThreshold = qtyThreshold;
    }
    
    @Override
    public String toString() {
        return drug.getDrugName();
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(String stockStatus) {
        this.stockStatus = stockStatus;
    }
}
