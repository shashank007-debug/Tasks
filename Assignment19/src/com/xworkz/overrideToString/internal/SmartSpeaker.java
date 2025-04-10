package com.xworkz.overrideToString.internal;

public class SmartSpeaker {
    private String brand;
    private String model;
    private String assistant;

    public SmartSpeaker(String brand, String model, String assistant) {
        this.brand = brand;
        this.model = model;
        this.assistant = assistant;
    }

    @Override
    public String toString() {
        return "SmartSpeaker [brand=" + brand + ", model=" + model + ", assistant=" + assistant + "]";
    }

}
