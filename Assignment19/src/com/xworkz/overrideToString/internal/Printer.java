package com.xworkz.overrideToString.internal;

public class Printer {
    private String brand;
    private String model;
    private String type;

    public Printer(String brand, String model, String type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Printer [brand=" + brand + ", model=" + model + ", type=" + type + "]";
    }

    @Override
    public int hashCode() {
        return 59;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Printer) {
                Printer other = (Printer) obj;
                return this.brand.equals(other.brand) && this.type.equals(other.type);
            }
        }
        return false;
    }
}
