package com.xworkz.overrideToString.internal;

public class StandMixer {
    private String brand;
    private String model;
    private int speedSettings;

    public StandMixer(String brand, String model, int speedSettings) {
        this.brand = brand;
        this.model = model;
        this.speedSettings = speedSettings;
    }

    @Override
    public String toString() {
        return "StandMixer [brand=" + brand + ", model=" + model + ", speedSettings=" + speedSettings + "]";
    }
}
