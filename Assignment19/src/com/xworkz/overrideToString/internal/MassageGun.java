package com.xworkz.overrideToString.internal;

public class MassageGun {
    private String brand;
    private String model;
    private int speedSettings;

    public MassageGun(String brand, String model, int speedSettings) {
        this.brand = brand;
        this.model = model;
        this.speedSettings = speedSettings;
    }

    @Override
    public String toString() {
        return "MassageGun [brand=" + brand + ", model=" + model + ", speedSettings=" + speedSettings + "]";
    }
    @Override
    public int hashCode() {
        return 52;
    }
}
