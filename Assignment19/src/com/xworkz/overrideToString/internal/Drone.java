package com.xworkz.overrideToString.internal;

public class Drone {
    private String brand;
    private String model;
    private int propellers;

    public Drone(String brand, String model, int propellers) {
        this.brand = brand;
        this.model = model;
        this.propellers = propellers;
    }

    @Override
    public String toString() {
        return "Drone [brand=" + brand + ", model=" + model + ", propellers=" + propellers + "]";
    }
    @Override
    public int hashCode() {
        return 20;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(obj instanceof Drone){
                Drone obj1 = this;
                Drone obj2 = (Drone) obj;
                return(obj1.model.equals(obj2.model));
            }
        }
        return false;
    }
}
