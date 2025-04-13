package com.xworkz.overrideToString.internal;

public class Stapler {
    private String brand;
    private String model;
    private int capacity;

    public Stapler(String brand, String model, int capacity) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Stapler [brand=" + brand + ", model=" + model + ", capacity=" + capacity + "]";
    }

    @Override
    public int hashCode() {
        return 77;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Stapler) {
                Stapler other = (Stapler) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model) && this.capacity == other.capacity;
            }
        }
        return false;
    }
}
