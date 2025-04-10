package com.xworkz.overrideToString.internal;

public class VRHeadset {
    private String brand;
    private String model;
    private int storage;

    public VRHeadset(String brand, String model, int storage) {
        this.brand = brand;
        this.model = model;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "VRHeadset [brand=" + brand + ", model=" + model + ", storage=" + storage + "GB]";
    }
    @Override
    public int hashCode() {
        return 90;
    }
}
