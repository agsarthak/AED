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
public class InitializationFile {
//    StoreCatalog storeCatalog;
    Store st;
    Pharmacy ph;
    
    public InitializationFile(StoreCatalog storeCatalog){
        st = storeCatalog.addStore();
        st.setStoreName("Store1");
    }
    
    public InitializationFile(PharmacyDirectory pharmacyDirectory) {
       ph = pharmacyDirectory.addPharmacy();
       ph.setPharmaName("Pharmacy1");
    }
    

}
