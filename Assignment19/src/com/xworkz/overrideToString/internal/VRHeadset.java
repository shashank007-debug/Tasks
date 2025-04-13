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

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof VRHeadset) {
                VRHeadset other = (VRHeadset) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model) && this.storage == other.storage;
            }
        }
        return false;
    }
}
