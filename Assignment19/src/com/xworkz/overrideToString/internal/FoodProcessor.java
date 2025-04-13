package com.xworkz.overrideToString.internal;

public class FoodProcessor {
    private String brand;
    private String model;
    private int capacity;

    public FoodProcessor(String brand, String model, int capacity) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "FoodProcessor [brand=" + brand + ", model=" + model + ", capacity=" + capacity + "cup]";
    }

    @Override
    public int hashCode() {
        return 35;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof FoodProcessor) {
                FoodProcessor other = (FoodProcessor) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model);
            }
        }
        return false;
    }
}
