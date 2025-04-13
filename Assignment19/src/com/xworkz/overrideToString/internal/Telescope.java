package com.xworkz.overrideToString.internal;

public class Telescope {
    private String brand;
    private String model;
    private int aperture;

    public Telescope(String brand, String model, int aperture) {
        this.brand = brand;
        this.model = model;
        this.aperture = aperture;
    }

    @Override
    public String toString() {
        return "Telescope [brand=" + brand + ", model=" + model + ", aperture=" + aperture + "mm]";
    }

    @Override
    public int hashCode() {
        return 81;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Telescope) {
                Telescope other = (Telescope) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model) && this.aperture == other.aperture;
            }
        }
        return false;
    }
}
