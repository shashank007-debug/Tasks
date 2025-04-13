package com.xworkz.overrideToString.internal;

public class Toaster {
    private String brand;
    private String model;
    private int slots;

    public Toaster(String brand, String model, int slots) {
        this.brand = brand;
        this.model = model;
        this.slots = slots;
    }

    @Override
    public String toString() {
        return "Toaster [brand=" + brand + ", model=" + model + ", slots=" + slots + "]";
    }

    @Override
    public int hashCode() {
        return 85;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Toaster) {
                Toaster other = (Toaster) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model) && this.slots == other.slots;
            }
        }
        return false;
    }
}
