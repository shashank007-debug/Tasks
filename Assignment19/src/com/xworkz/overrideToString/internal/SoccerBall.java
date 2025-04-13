package com.xworkz.overrideToString.internal;

public class SoccerBall {
    private String brand;
    private String model;
    private int size;

    public SoccerBall(String brand, String model, int size) {
        this.brand = brand;
        this.model = model;
        this.size = size;
    }

    @Override
    public String toString() {
        return "SoccerBall [brand=" + brand + ", model=" + model + ", size=" + size + "]";
    }

    @Override
    public int hashCode() {
        return 76;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof SoccerBall) {
                SoccerBall other = (SoccerBall) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model) && this.size == other.size;
            }
        }
        return false;
    }
}
