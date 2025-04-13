package com.xworkz.overrideToString.internal;

public class DumbbellSet {
    private String brand;
    private String model;
    private double maxWeight;

    public DumbbellSet(String brand, String model, double maxWeight) {
        this.brand = brand;
        this.model = model;
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        return "DumbbellSet [brand=" + brand + ", model=" + model + ", maxWeight=" + maxWeight + "lbs]";
    }

    @Override
    public int hashCode() {
        return 23;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof DumbbellSet) {
                DumbbellSet obj1 = this;
                DumbbellSet obj2 = (DumbbellSet) obj;
                return (obj1.model.equals(obj2.model));
            }
        }
        return false;
    }
}