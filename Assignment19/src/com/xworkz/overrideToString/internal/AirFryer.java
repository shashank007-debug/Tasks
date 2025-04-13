package com.xworkz.overrideToString.internal;

public class AirFryer {
    private String brand;
    private String model;
    private double capacity;

    public AirFryer(String brand, String model, double capacity) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "AirFryer [brand=" + brand + ", model=" + model + ", capacity=" + capacity + "qt]";
    }
    @Override
    public int hashCode() {
        return 2;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(obj instanceof AirFryer){
                AirFryer airFryer1 = this;
                AirFryer airFryer2 = (AirFryer) obj;
                return (airFryer1.brand.equals(airFryer2.brand));
            }
        }
        return false;
    }
}
