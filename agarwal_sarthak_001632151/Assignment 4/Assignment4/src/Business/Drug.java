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
public class Drug {
    private String drugName;
    private String manufacturingDate;
    private String listPrice;
    private String description;
    private String type;
    private String drugMake;
    private String mainSalt;
    private String use;
    private String weight;
    private String composition;
    
        

    
    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(String manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getListPrice() {
        return listPrice;
    }

    public void setListPrice(String listPrice) {
        this.listPrice = listPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setDrugType(String type) {
        this.type = type;
    }

    public String getDrugMake() {
        return drugMake;
    }

    public void setDrugMake(String drugMake) {
        this.drugMake = drugMake;
    }

    public String getMainSalt() {
        return mainSalt;
    }

    public void setMainSalt(String mainSalt) {
        this.mainSalt = mainSalt;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }
    
    @Override
    public String toString() {
        return drugName;
    }


    
}
