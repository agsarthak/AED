/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.HashMap;

/**
 *
 * @author Sarthak
 */
public class Business {
    
    private SupplierDirectory supplierDirectory;
    private MasterOrderCatalog masterOrderCatalog;
    private SalespersonDirectory salespersonDirectory;
    private CustomerDirectory customerDirectory;
    
    public Business() {
        supplierDirectory = new SupplierDirectory();
        masterOrderCatalog = new MasterOrderCatalog();
        salespersonDirectory = new SalespersonDirectory();
        customerDirectory = new CustomerDirectory();
    }

    public void top3Salesperson(){
        int key = 1;
        HashMap<Integer, Salesperson> keySalespersonMap = new HashMap<Integer, Salesperson>();
        
        for (Order order : masterOrderCatalog.getOrderCatalog()){
            if (keySalespersonMap.containsValue(order)){
            keySalespersonMap.put(key,order.getSalesPerson()); 
            }
            else{
                keySalespersonMap.put(key++,order.getSalesPerson());
            }
        }
        
        
        
    }
    
    public void totalCommission(){
        for (Order order : masterOrderCatalog.getOrderCatalog()){
            order.getCommission();
        }
    }
    
    
    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public void setSupplierDirectory(SupplierDirectory supplierDirectory) {
        this.supplierDirectory = supplierDirectory;
    }

    public MasterOrderCatalog getMasterOrderCatalog() {
        return masterOrderCatalog;
    }

    public void setMasterOrderCatalog(MasterOrderCatalog masterOrderCatalog) {
        this.masterOrderCatalog = masterOrderCatalog;
    }

    public SalespersonDirectory getSalespersonDirectory() {
        return salespersonDirectory;
    }

    public void setSalespersonDirectory(SalespersonDirectory salespersonDirectory) {
        this.salespersonDirectory = salespersonDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
}
