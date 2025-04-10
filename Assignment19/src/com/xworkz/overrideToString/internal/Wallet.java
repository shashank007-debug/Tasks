package com.xworkz.overrideToString.internal;

public class Wallet {
    private String brand;
    private String model;
    private int cardSlots;

    public Wallet(String brand, String model, int cardSlots) {
        this.brand = brand;
        this.model = model;
        this.cardSlots = cardSlots;
    }

    @Override
    public String toString() {
        return "Wallet [brand=" + brand + ", model=" + model + ", cardSlots=" + cardSlots + "]";
    }
    @Override
    public int hashCode() {
        return 91;
    }
}
