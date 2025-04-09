package com.xworkz.overrideToString.internal;

public class SlowCooker {
    private String brand;
    private String model;
    private int capacity;

    public SlowCooker(String brand, String model, int capacity) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "SlowCooker [brand=" + brand + ", model=" + model + ", capacity=" + capacity + "qt]";
    }
}
