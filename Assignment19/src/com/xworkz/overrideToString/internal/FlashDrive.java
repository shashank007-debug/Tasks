package com.xworkz.overrideToString.internal;

public class FlashDrive {
    private String brand;
    private String model;
    private int capacity;

    public FlashDrive(String brand, String model, int capacity) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "FlashDrive [brand=" + brand + ", model=" + model + ", capacity=" + capacity + "GB]";
    }

    @Override
    public int hashCode() {
        return 33;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof FlashDrive) {
                FlashDrive other = (FlashDrive) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model);
            }
        }
        return false;
    }
}
