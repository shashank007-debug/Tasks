package com.xworkz.overrideToString.internal;

public class Kettlebell {
    private String brand;
    private String model;
    private int weight;

    public Kettlebell(String brand, String model, int weight) {
        this.brand = brand;
        this.model = model;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Kettlebell [brand=" + brand + ", model=" + model + ", weight=" + weight + "lbs]";
    }

    @Override
    public int hashCode() {
        return 49;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Kettlebell) {
                Kettlebell other = (Kettlebell) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model);
            }
        }
        return false;
    }
}
