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

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Wallet) {
                Wallet other = (Wallet) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model) && this.cardSlots == other.cardSlots;
            }
        }
        return false;
    }
}
