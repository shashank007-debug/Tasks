package com.xworkz.overrideToString.internal;

public class Toothbrush {
    private String brand;
    private String model;
    private String type;

    public Toothbrush(String brand, String model, String type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Toothbrush [brand=" + brand + ", model=" + model + ", type=" + type + "]";
    }

    @Override
    public int hashCode() {
        return 86;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Toothbrush) {
                Toothbrush other = (Toothbrush) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model) && this.type.equals(other.type);
            }
        }
        return false;
    }
}
