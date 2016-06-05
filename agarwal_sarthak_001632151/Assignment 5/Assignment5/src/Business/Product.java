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
public class Product implements Comparable<Product>{
    
    private String prodName;
    private int price;
    private int modelNumber;
    private int avail;
    private int ceilingPrice;
    private int floorPrice;
    private int prodOrderHis;
    
    private static int count =0;

    @Override
    public String toString() {
        return prodName; //To change body of generated methods, choose Tools | Templates.
    }

     public int getAvail() {
        return avail;
    }
    
    public void setAvail(int avail) {
        this.avail = avail;
    }
    
    public Product() {
    count++;
    modelNumber = count;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public int getCeilingPrice() {
        return ceilingPrice;
    }

    public void setCeilingPrice(int ceilingPrice) {
        this.ceilingPrice = ceilingPrice;
    }

    public int getFloorPrice() {
        return floorPrice;
    }

    public void setFloorPrice(int floorPrice) {
        this.floorPrice = floorPrice;
    }

    public int getProdOrderHis() {
        return prodOrderHis;
    }

    public void setProdOrderHis(int prodOrderHis) {
        this.prodOrderHis = prodOrderHis;
    }

    @Override
    public int compareTo(Product o) {
        int compareCount = o.getProdOrderHis();
        return compareCount - this.prodOrderHis;
    }
    
}
