package com.xworkz.overrideToString.internal;

public class ElectricBike {
    private String brand;
    private String model;
    private int motorPower;

    public ElectricBike(String brand, String model, int motorPower) {
        this.brand = brand;
        this.model = model;
        this.motorPower = motorPower;
    }

    @Override
    public String toString() {
        return "ElectricBike [brand=" + brand + ", model=" + model + ", motorPower=" + motorPower + "W]";
    }
    @Override
    public int hashCode() {
        return 24;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(obj instanceof ElectricBike){
                ElectricBike obj1 = this;
                ElectricBike obj2 = (ElectricBike) obj;
                return(obj1.model.equals(obj2.model));
            }
        }
        return false;
    }
}
