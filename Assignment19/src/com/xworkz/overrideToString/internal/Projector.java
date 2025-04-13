package com.xworkz.overrideToString.internal;

public class Projector {
    private String brand;
    private String model;
    private int brightness;

    public Projector(String brand, String model, int brightness) {
        this.brand = brand;
        this.model = model;
        this.brightness = brightness;
    }

    @Override
    public String toString() {
        return "Projector [brand=" + brand + ", model=" + model + ", brightness=" + brightness + " lumens]";
    }

    @Override
    public int hashCode() {
        return 60;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Projector) {
                Projector other = (Projector) obj;
                return this.brand.equals(other.brand) && this.brightness == other.brightness;
            }
        }
        return false;
    }
}
