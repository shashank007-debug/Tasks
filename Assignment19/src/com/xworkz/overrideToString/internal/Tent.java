package com.xworkz.overrideToString.internal;

public class Tent {
    private String brand;
    private String model;
    private int capacity;

    public Tent(String brand, String model, int capacity) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Tent [brand=" + brand + ", model=" + model + ", capacity=" + capacity + " people]";
    }

    @Override
    public int hashCode() {
        return 83;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Tent) {
                Tent other = (Tent) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model) && this.capacity == other.capacity;
            }
        }
        return false;
    }
}
