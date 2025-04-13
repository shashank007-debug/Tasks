package com.xworkz.overrideToString.internal;

public class Treadmill {
    private String brand;
    private String model;
    private double maxSpeed;

    public Treadmill(String brand, String model, double maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Treadmill [brand=" + brand + ", model=" + model + ", maxSpeed=" + maxSpeed + "mph]";
    }

    @Override
    public int hashCode() {
        return 88;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Treadmill) {
                Treadmill other = (Treadmill) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model) && this.maxSpeed == other.maxSpeed;
            }
        }
        return false;
    }
}
