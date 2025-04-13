package com.xworkz.overrideToString.internal;

public class Webcam {
    private String brand;
    private String model;
    private int resolution;

    public Webcam(String brand, String model, int resolution) {
        this.brand = brand;
        this.model = model;
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Webcam [brand=" + brand + ", model=" + model + ", resolution=" + resolution + "p]";
    }

    @Override
    public int hashCode() {
        return 31 * brand.hashCode() + 17 * model.hashCode() + 13 * resolution;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Webcam) {
            Webcam other = (Webcam) obj;
            return this.brand.equals(other.brand) && this.model.equals(other.model) && this.resolution == other.resolution;
        }
        return false;
    }
}
