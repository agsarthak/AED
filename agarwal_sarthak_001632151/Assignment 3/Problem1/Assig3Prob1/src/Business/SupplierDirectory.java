package Business;

import java.util.ArrayList;

/**
 *
 * @author Sarthak
 */
public class SupplierDirectory {
    
        public ArrayList<Supplier> supplierList;
 
        public SupplierDirectory(){
           supplierList = new ArrayList<>();
            }
      
      
      public Supplier addSupplier(){
        Supplier supplier = new Supplier();
        supplierList.add(supplier);
        return supplier;
      }
      
      
      public ArrayList<Supplier> getSupplier() {
        return supplierList;
    }

}
