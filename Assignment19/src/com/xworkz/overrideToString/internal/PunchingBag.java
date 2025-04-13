package com.xworkz.overrideToString.internal;

public class PunchingBag {
    private String brand;
    private String model;
    private int weight;

    public PunchingBag(String brand, String model, int weight) {
        this.brand = brand;
        this.model = model;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "PunchingBag [brand=" + brand + ", model=" + model + ", weight=" + weight + "lbs]";
    }

    @Override
    public int hashCode() {
        return 61;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof PunchingBag) {
                PunchingBag other = (PunchingBag) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model) && this.weight == other.weight;
            }
        }
        return false;
    }
}
