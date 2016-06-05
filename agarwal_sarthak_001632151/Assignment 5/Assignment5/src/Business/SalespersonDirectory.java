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
public class SalespersonDirectory {
    private ArrayList<Salesperson> salesPersonList;
    
    public SalespersonDirectory(){
        salesPersonList = new ArrayList<Salesperson>();
    }

    public ArrayList<Salesperson> getSalesPersonList() {
        return salesPersonList;
    }

    public Salesperson addSalesperson(){
        Salesperson s = new Salesperson();
        salesPersonList.add(s);
        return s;
    }
    
    public void removeSalesperson(Salesperson s){
        salesPersonList.remove(s);
    }
    
    public Salesperson searchSalesperson(String keyword){
        for (Salesperson salesperson : salesPersonList) {
            if(salesperson.getEmployeeName().equals(keyword)){
                return salesperson;
            }
        }
        return null;
    }
    
    
    
}
