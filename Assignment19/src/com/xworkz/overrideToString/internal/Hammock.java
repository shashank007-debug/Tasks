package com.xworkz.overrideToString.internal;

public class Hammock {
    private String brand;
    private String model;
    private int capacity;

    public Hammock(String brand, String model, int capacity) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Hammock [brand=" + brand + ", model=" + model + ", capacity=" + capacity + "person]";
    }
    @Override
    public int hashCode() {
        return 43;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Hammock) {
                Hammock other = (Hammock) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model);
            }
        }
        return false;
    }
}
