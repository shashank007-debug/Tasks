package com.xworkz.overrideToString.internal;

public class Kayak {
    private String brand;
    private String model;
    private int length;

    public Kayak(String brand, String model, int length) {
        this.brand = brand;
        this.model = model;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Kayak [brand=" + brand + ", model=" + model + ", length=" + length + "ft]";
    }

    @Override
    public int hashCode() {
        return 48;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Kayak) {
                Kayak other = (Kayak) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model);
            }
        }
        return false;
    }
}
