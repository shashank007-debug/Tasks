package com.xworkz.overrideToString.internal;

public class WaterFlosser {
    private String brand;
    private String model;
    private int pressureSettings;

    public WaterFlosser(String brand, String model, int pressureSettings) {
        this.brand = brand;
        this.model = model;
        this.pressureSettings = pressureSettings;
    }

    @Override
    public String toString() {
        return "WaterFlosser [brand=" + brand + ", model=" + model + ", pressureSettings=" + pressureSettings + "]";
    }
}
