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
public class Main {
    
     public static void main(String[] args) {
            SupplierDirectory supplierDirectory = new SupplierDirectory();
        
            Supplier sp = supplierDirectory.addSupplier();
            sp.setSupplierName("Dell");
            
            Product p1 = sp.getProductCatalog().addProduct();
            p1.setProductName("DellP1");
            p1.setProductId(1);
           
            Product p2 = sp.getProductCatalog().addProduct();
            p2.setProductName("DellP2");
            p2.setProductId(2);
            
            Product p3 = sp.getProductCatalog().addProduct();
            p3.setProductName("DellP3");
            p3.setProductId(3);
            
            Product p4 = sp.getProductCatalog().addProduct();
            p4.setProductName("DellP4");
            p4.setProductId(4);
           
            Product p5 = sp.getProductCatalog().addProduct();
            p5.setProductName("DellP5");
            p5.setProductId(5);
            
            Product p6 = sp.getProductCatalog().addProduct();
            p6.setProductName("DellP6");
            p6.setProductId(6);
            
            Product p7 = sp.getProductCatalog().addProduct();
            p7.setProductName("DellP7");
            p7.setProductId(7);
            
            Product p8 = sp.getProductCatalog().addProduct();
            p8.setProductName("DellP8");
            p8.setProductId(8);
            
            Product p9 = sp.getProductCatalog().addProduct();
            p9.setProductName("DellP9");
            p9.setProductId(9);
           
            Product p10 = sp.getProductCatalog().addProduct();
            p10.setProductName("DellP10");
            p10.setProductId(10);
            
            System.out.println("Supplier Name:" + " " + sp.getSupplierName());
            
            for (Product pro1:sp.getProductCatalog().getProductList())
                    {
                        System.out.println("Product Name: " + pro1.getProductName() + " , Product ID:  " +pro1.getProductId());                
                    }
            
            ////////////////////////////////////////////HP
            Supplier s2 = supplierDirectory.addSupplier();
            s2.setSupplierName("HP");
            
            Product s2p1 = s2.getProductCatalog().addProduct();
            s2p1.setProductName("HP_P1");
            s2p1.setProductId(1);
            
            Product s2p2 = s2.getProductCatalog().addProduct();
            s2p2.setProductName("HP_P2");
            s2p2.setProductId(2);
            
            Product s2p3 = s2.getProductCatalog().addProduct();
            s2p3.setProductName("HP_P3");
            s2p3.setProductId(3);
            
            Product s2p4 = s2.getProductCatalog().addProduct();
            s2p4.setProductName("HP_P4");
            s2p4.setProductId(4);
            
            Product s2p5 = s2.getProductCatalog().addProduct();
            s2p5.setProductName("HP_P5");
            s2p5.setProductId(5);
            
            Product s2p6 = s2.getProductCatalog().addProduct();
            s2p6.setProductName("HP_P6");
            s2p6.setProductId(6);
            
            Product s2p7 = s2.getProductCatalog().addProduct();
            s2p7.setProductName("HP_P7");
            s2p7.setProductId(7);
            
            Product s2p8 = s2.getProductCatalog().addProduct();
            s2p8.setProductName("HP_P8");
            s2p8.setProductId(8);
            
            Product s2p9 = s2.getProductCatalog().addProduct();
            s2p9.setProductName("HP_P9");
            s2p9.setProductId(9);
            
            Product s2p10 = s2.getProductCatalog().addProduct();
            s2p10.setProductName("HP_P10");
            s2p10.setProductId(10);
            
            System.out.println("Supplier Name:" + " " + s2.getSupplierName());
            
            for (Product pro1:s2.getProductCatalog().getProductList())
                    {
                        System.out.println("Product Name: " + pro1.getProductName() + " , Product ID:  " +pro1.getProductId());                
                    }
            
            //////////////////////// Apple
            Supplier s3 = supplierDirectory.addSupplier();
            s3.setSupplierName("Apple");
            
            Product s3p1 = s3.getProductCatalog().addProduct();
            s3p1.setProductName("Apple_P1");
            s3p1.setProductId(1);
            
            Product s3p2 = s3.getProductCatalog().addProduct();
            s3p2.setProductName("Apple_P2");
            s3p2.setProductId(1);
            
            Product s3p3 = s3.getProductCatalog().addProduct();
            s3p3.setProductName("Apple_P3");
            s3p3.setProductId(3);
            
            Product s3p4 = s3.getProductCatalog().addProduct();
            s3p4.setProductName("Apple_P4");
            s3p4.setProductId(4);
            
            Product s3p5 = s3.getProductCatalog().addProduct();
            s3p5.setProductName("Apple_P5");
            s3p5.setProductId(5);
            
            Product s3p6 = s3.getProductCatalog().addProduct();
            s3p6.setProductName("Apple_P6");
            s3p6.setProductId(6);
            
            Product s3p7 = s3.getProductCatalog().addProduct();
            s3p7.setProductName("Apple_P7");
            s3p7.setProductId(7);
            
            Product s3p8 = s3.getProductCatalog().addProduct();
            s3p8.setProductName("Apple_P8");
            s3p8.setProductId(8);
            
            Product s3p9 = s3.getProductCatalog().addProduct();
            s3p9.setProductName("Apple_P9");
            s3p9.setProductId(9);
            
            Product s3p10 = s3.getProductCatalog().addProduct();
            s3p10.setProductName("Apple_P10");
            s3p10.setProductId(10);
            
            System.out.println("Supplier Name:" + " " + s3.getSupplierName());
            
            for (Product pro1:s3.getProductCatalog().getProductList())
                    {
                        System.out.println("Product Name: " + pro1.getProductName() + " , Product ID:  " +pro1.getProductId());                
                    }
            

            ///////////////Toshiba
            Supplier s4 = supplierDirectory.addSupplier();
            s4.setSupplierName("Toshiba");
            
            Product s4p1 = s4.getProductCatalog().addProduct();
            s4p1.setProductName("Toshiba_P1");
            s4p1.setProductId(1);
            
            Product s4p2 = s4.getProductCatalog().addProduct();
            s4p2.setProductName("Toshiba_P2");
            s4p2.setProductId(1);
            
            Product s4p3 = s4.getProductCatalog().addProduct();
            s4p3.setProductName("Toshiba_P3");
            s4p3.setProductId(3);
            
            Product s4p4 = s4.getProductCatalog().addProduct();
            s4p4.setProductName("Toshiba_P4");
            s4p4.setProductId(4);
            
            Product s4p5 = s4.getProductCatalog().addProduct();
            s4p5.setProductName("Toshiba_P5");
            s4p5.setProductId(5);
            
            Product s4p6 = s4.getProductCatalog().addProduct();
            s4p6.setProductName("Toshiba_P6");
            s4p6.setProductId(6);
            
            Product s4p7 = s4.getProductCatalog().addProduct();
            s4p7.setProductName("Toshiba_P7");
            s4p7.setProductId(7);
            
            Product s4p8 = s4.getProductCatalog().addProduct();
            s4p8.setProductName("Toshiba_P8");
            s4p8.setProductId(8);
            
            Product s4p9 = s4.getProductCatalog().addProduct();
            s4p9.setProductName("Toshiba_P9");
            s4p9.setProductId(9);
            
            Product s4p10 = s4.getProductCatalog().addProduct();
            s4p10.setProductName("Toshiba_P10");
            s4p10.setProductId(10);
            
            System.out.println("Supplier Name:" + " " + s4.getSupplierName());
            
            for (Product pro1:s4.getProductCatalog().getProductList())
                    {
                        System.out.println("Product Name: " + pro1.getProductName() + " , Product ID:  " +pro1.getProductId());                
                    }
            
            
            ///////////////////////////////Lenovo
            Supplier s5 = supplierDirectory.addSupplier();
            s5.setSupplierName("Lenovo");
            
            Product s5p1 = s5.getProductCatalog().addProduct();
            s5p1.setProductName("Lenovo_P1");
            s5p1.setProductId(1);
            
            Product s5p2 = s5.getProductCatalog().addProduct();
            s5p2.setProductName("Lenovo_P2");
            s5p2.setProductId(1);
            
            Product s5p3 = s5.getProductCatalog().addProduct();
            s5p3.setProductName("Lenovo_P3");
            s5p3.setProductId(3);
            
            Product s5p4 = s5.getProductCatalog().addProduct();
            s5p4.setProductName("Lenovo_P4");
            s5p4.setProductId(4);
            
            Product s5p5 = s5.getProductCatalog().addProduct();
            s5p5.setProductName("Lenovo_P5");
            s5p5.setProductId(5);
            
            Product s5p6 = s5.getProductCatalog().addProduct();
            s5p6.setProductName("Lenovo_P6");
            s5p6.setProductId(6);
            
            Product s5p7 = s5.getProductCatalog().addProduct();
            s5p7.setProductName("Lenovo_P7");
            s5p7.setProductId(7);
            
            Product s5p8 = s5.getProductCatalog().addProduct();
            s5p8.setProductName("Lenovo_P8");
            s5p8.setProductId(8);
            
            Product s5p9 = s5.getProductCatalog().addProduct();
            s5p9.setProductName("Lenovo_P9");
            s5p9.setProductId(9);
            
            Product s5p10 = s5.getProductCatalog().addProduct();
            s5p10.setProductName("Lenovo_P10");
            s5p10.setProductId(10);
            
            System.out.println("Supplier Name:" + " " + s5.getSupplierName());
            
            for (Product pro1:s5.getProductCatalog().getProductList())
                    {
                        System.out.println("Product Name: " + pro1.getProductName() + " , Product ID:  " +pro1.getProductId());                
                    }
            
            /////////
            
            
            
     }
     

    }
    
