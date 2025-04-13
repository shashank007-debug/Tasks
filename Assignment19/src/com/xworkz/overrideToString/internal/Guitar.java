package com.xworkz.overrideToString.internal;

public class Guitar {
    private String brand;
    private String model;
    private int strings;

    public Guitar(String brand, String model, int strings) {
        this.brand = brand;
        this.model = model;
        this.strings = strings;
    }

    @Override
    public String toString() {
        return "Guitar [brand=" + brand + ", model=" + model + ", strings=" + strings + "]";
    }

    @Override
    public int hashCode() {
        return 41;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Guitar) {
                Guitar other = (Guitar) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model);
            }
        }
        return false;
    }
}
