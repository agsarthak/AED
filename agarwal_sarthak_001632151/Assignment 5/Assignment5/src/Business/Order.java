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
public class Order {
    
    private static int count = 0;
//    private static int salescnt = 1;
    private ArrayList<OrderItem> orderItemList;
    private int orderNumber;
    private Salesperson salesPerson;
    private Customer customer;
    private float commission;
    
    public Order(Salesperson salesperson, Customer customer) {
        count++;
        orderNumber = count;
        orderItemList = new ArrayList<>();
        this.salesPerson = salesperson;
        this.customer = customer;
        salesperson.setSalesCount(salesperson.getSalesCount() +1);
        customer.setOrderCount(customer.getOrderCount()+1);
        
    }
    
    
    public int getOrderNumber() {
        return orderNumber;
    }
    
    public void removeOrderItem(OrderItem o) {
        orderItemList.remove(o);
    }
    
    public OrderItem addOrderItem(Product p, int q, int price) {
        OrderItem o = new OrderItem();
        o.setProduct(p);
        o.setQuantity(q);
        o.setSalesPrice(price);
        orderItemList.add(o);
        p.setProdOrderHis(p.getProdOrderHis()+1);
        return o;
    }
    
    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }
    
    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public Salesperson getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(Salesperson salesPerson) {
        this.salesPerson = salesPerson;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public float getCommission() {
        return commission;
    }

    public void setCommission(float commission) {
        this.commission = commission;
    }
    
}
