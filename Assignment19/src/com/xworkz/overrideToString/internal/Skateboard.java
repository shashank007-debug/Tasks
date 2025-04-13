package com.xworkz.overrideToString.internal;

public class Skateboard {
    private String brand;
    private String model;
    private double deckWidth;

    public Skateboard(String brand, String model, double deckWidth) {
        this.brand = brand;
        this.model = model;
        this.deckWidth = deckWidth;
    }

    @Override
    public String toString() {
        return "Skateboard [brand=" + brand + ", model=" + model + ", deckWidth=" + deckWidth + "]";
    }

    @Override
    public int hashCode() {
        return 70;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Skateboard) {
                Skateboard other = (Skateboard) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model) && this.deckWidth == other.deckWidth;
            }
        }
        return false;
    }
}
