package com.xworkz.overrideToString.internal;

public class Elliptical {
    private String brand;
    private String model;
    private int resistanceLevels;

    public Elliptical(String brand, String model, int resistanceLevels) {
        this.brand = brand;
        this.model = model;
        this.resistanceLevels = resistanceLevels;
    }

    @Override
    public String toString() {
        return "Elliptical [brand=" + brand + ", model=" + model + ", resistanceLevels=" + resistanceLevels + "]";
    }
    @Override
    public int hashCode() {
        return 28;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(obj instanceof Elliptical){
                Elliptical obj1 = this;
                Elliptical obj2 = (Elliptical) obj;
                return(obj1.model.equals(obj2.model));
            }
        }
        return false;
    }
}
