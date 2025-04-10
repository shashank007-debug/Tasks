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
}
