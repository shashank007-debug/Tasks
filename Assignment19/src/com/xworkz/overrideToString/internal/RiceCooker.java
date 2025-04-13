package com.xworkz.overrideToString.internal;

public class RiceCooker {
    private String brand;
    private String model;
    private double capacity;

    public RiceCooker(String brand, String model, double capacity) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "RiceCooker [brand=" + brand + ", model=" + model + ", capacity=" + capacity + "cup]";
    }

    @Override
    public int hashCode() {
        return 66;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof RiceCooker) {
                RiceCooker other = (RiceCooker) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model) && this.capacity == other.capacity;
            }
        }
        return false;
    }
}
