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
}
