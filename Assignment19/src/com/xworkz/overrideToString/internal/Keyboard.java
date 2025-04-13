package com.xworkz.overrideToString.internal;

public class Keyboard {
    private String brand;
    private String model;
    private String type;

    public Keyboard(String brand, String model, String type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Keyboard [brand=" + brand + ", model=" + model + ", type=" + type + "]";
    }

    @Override
    public int hashCode() {
        return 50;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Keyboard) {
                Keyboard other = (Keyboard) obj;
                return this.brand.equals(other.brand) && this.type.equals(other.type);
            }
        }
        return false;
    }
}
