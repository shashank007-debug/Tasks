package com.xworkz.overrideToString.internal;

public class ElectricScooter {
    private String brand;
    private String model;
    private double maxSpeed;

    public ElectricScooter(String brand, String model, double maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "ElectricScooter [brand=" + brand + ", model=" + model + ", maxSpeed=" + maxSpeed + "mph]";
    }
    @Override
    public int hashCode() {
        return 26;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(obj instanceof ElectricScooter){
                ElectricScooter obj1 = this;
                ElectricScooter obj2 = (ElectricScooter) obj;
                return(obj1.model.equals(obj2.model));
            }
        }
        return false;
    }
}
