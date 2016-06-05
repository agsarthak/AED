/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Collection;

/**
 *
 * @author Sarthak
 */
public class Customer implements Comparable<Customer>{
    private String customerName;
    private int customerId;
    private int orderCount;
    
    private static int count =100;

    public Customer() {
        count++;
        customerId = count;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return customerName;
    }

    public int getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }

    @Override
    public int compareTo(Customer o) {
        int compareCount = o.getOrderCount();
        return compareCount - this.orderCount;
    }
    
    
    
}
