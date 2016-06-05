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
public class Salesperson implements Comparable<Salesperson>{
    private int employeeId;
    private String employeeName;
    private int salesCount;
    private float totalCommision;
    private int noOfProdAboveTargetPrice;
    private int noOfProdBelowTargetPrice;
    
    private static int count =0;
    
    public Salesperson(){
        count++;
        employeeId = count;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    
    @Override
    public String toString() {
        return employeeName;
    }

    @Override
    public int compareTo(Salesperson o) {
        int compareCount = o.getSalesCount();
        return compareCount - this.salesCount;
    }

    public int getSalesCount() {
        return salesCount;
    }

    public void setSalesCount(int salesCount) {
        this.salesCount = salesCount;
    }

    public float getTotalCommision() {
        return totalCommision;
    }

    public void setTotalCommision(float totalCommision) {
        this.totalCommision = totalCommision;
    }

    public int getNoOfProdAboveTargetPrice() {
        return noOfProdAboveTargetPrice;
    }

    public void setNoOfProdAboveTargetPrice(int noOfProdAboveTargetPrice) {
        this.noOfProdAboveTargetPrice = noOfProdAboveTargetPrice;
    }

    public int getNoOfProdBelowTargetPrice() {
        return noOfProdBelowTargetPrice;
    }

    public void setNoOfProdBelowTargetPrice(int noOfProdBelowTargetPrice) {
        this.noOfProdBelowTargetPrice = noOfProdBelowTargetPrice;
    }
    
    
    
}
