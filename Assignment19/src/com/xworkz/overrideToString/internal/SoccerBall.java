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
}
