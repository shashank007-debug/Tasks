package com.xworkz.overrideToString.internal;

public class Router {
    private String brand;
    private String model;
    private String wifiStandard;

    public Router(String brand, String model, String wifiStandard) {
        this.brand = brand;
        this.model = model;
        this.wifiStandard = wifiStandard;
    }

    @Override
    public String toString() {
        return "Router [brand=" + brand + ", model=" + model + ", wifiStandard=" + wifiStandard + "]";
    }
}
