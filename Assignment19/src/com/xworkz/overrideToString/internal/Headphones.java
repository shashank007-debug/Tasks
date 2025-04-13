package com.xworkz.overrideToString.internal;

public class Headphones {
    private String brand;
    private String model;
    private boolean wireless;

    public Headphones(String brand, String model, boolean wireless) {
        this.brand = brand;
        this.model = model;
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return "Headphones [brand=" + brand + ", model=" + model + ", wireless=" + wireless + "]";
    }

    @Override
    public int hashCode() {
        return 44;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Headphones) {
                Headphones other = (Headphones) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model);
            }
        }
        return false;
    }
}
