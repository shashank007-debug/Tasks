package com.xworkz.overrideToString.internal;

public class Humidifier {
    private String brand;
    private String model;
    private double tankSize;

    public Humidifier(String brand, String model, double tankSize) {
        this.brand = brand;
        this.model = model;
        this.tankSize = tankSize;
    }

    @Override
    public String toString() {
        return "Humidifier [brand=" + brand + ", model=" + model + ", tankSize=" + tankSize + "L]";
    }

    @Override
    public int hashCode() {
        return 45;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Humidifier) {
                Humidifier other = (Humidifier) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model);
            }
        }
        return false;
    }
}
