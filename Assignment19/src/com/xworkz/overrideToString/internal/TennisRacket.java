package com.xworkz.overrideToString.internal;

public class TennisRacket {
    private String brand;
    private String model;
    private int headSize;

    public TennisRacket(String brand, String model, int headSize) {
        this.brand = brand;
        this.model = model;
        this.headSize = headSize;
    }

    @Override
    public String toString() {
        return "TennisRacket [brand=" + brand + ", model=" + model + ", headSize=" + headSize + "sq in]";
    }
}