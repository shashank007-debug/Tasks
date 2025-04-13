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

    @Override
    public int hashCode() {
        return 74;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof SmartSpeaker) {
                SmartSpeaker other = (SmartSpeaker) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model) && this.assistant.equals(other.assistant);
            }
        }
        return false;
    }
}
