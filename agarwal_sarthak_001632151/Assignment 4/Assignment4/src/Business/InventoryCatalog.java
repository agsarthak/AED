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
public class InventoryCatalog {
    ArrayList<Inventory> inventoryList;

    public InventoryCatalog() {
        this.inventoryList = new ArrayList<Inventory>();
    }
    
    public ArrayList<Inventory> getInventoryList() {
        return inventoryList;
    }
    
    
  public Inventory addInventory(){
        Inventory inventory = new Inventory();
        inventoryList.add(inventory);
        return inventory;
    }
  
    public void removeInventory(Inventory inventory){
        inventoryList.remove(inventory);
    }
    
}
