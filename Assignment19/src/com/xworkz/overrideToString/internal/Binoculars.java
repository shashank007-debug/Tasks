package com.xworkz.overrideToString.internal;

public class Binoculars {
    private String brand;
    private String model;
    private int magnification;

    public Binoculars(String brand, String model, int magnification) {
        this.brand = brand;
        this.model = model;
        this.magnification = magnification;
    }

    @Override
    public String toString() {
        return "Binoculars [brand=" + brand + ", model=" + model + ", magnification=" + magnification + "x]";
    }
    @Override
    public int hashCode() {
        return 7;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(obj instanceof Binoculars){
                Binoculars obj1 = this;
                Binoculars obj2 = (Binoculars) obj;
                return(obj1.model.equals(obj2.model));
            }
        }
        return false;
    }
}
