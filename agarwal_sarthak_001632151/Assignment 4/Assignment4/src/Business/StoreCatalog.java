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
public class StoreCatalog {
    private ArrayList<Store> storeList;

    public StoreCatalog() {
        this.storeList = new ArrayList<Store>();
    }

    public ArrayList<Store> getStoreList() {
        return storeList;
    }

       
    public Store addStore(){
        Store store = new Store();
        storeList.add(store);
        return store;
    }
    
    public void removeStore(Store store){
        storeList.remove(store);
    }
    
    public Store searchStore(String keyword){
        for (Store store : storeList) {
            if(store.getStoreName().equals(keyword)){
                return store;
            }
        }
        return null;
    }
}
