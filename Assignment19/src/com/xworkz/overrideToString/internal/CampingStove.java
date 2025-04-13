package com.xworkz.overrideToString.internal;

public class CampingStove {
    private String brand;
    private String model;
    private int burners;

    public CampingStove(String brand, String model, int burners) {
        this.brand = brand;
        this.model = model;
        this.burners = burners;
    }

    @Override
    public String toString() {
        return "CampingStove [brand=" + brand + ", model=" + model + ", burners=" + burners + "]";
    }
    @Override
    public int hashCode() {
        return 14;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(obj instanceof CampingStove){
                CampingStove obj1 = this;
                CampingStove obj2 = (CampingStove) obj;
                return(obj1.model.equals(obj2.model));
            }
        }
        return false;
    }
}
