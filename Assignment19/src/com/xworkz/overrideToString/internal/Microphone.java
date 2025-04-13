package com.xworkz.overrideToString.internal;

public class Microphone {
    private String brand;
    private String model;
    private String type;

    public Microphone(String brand, String model, String type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Microphone [brand=" + brand + ", model=" + model + ", type=" + type + "]";
    }

    @Override
    public int hashCode() {
        return 53;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Microphone) {
                Microphone other = (Microphone) obj;
                return this.brand.equals(other.brand) && this.type.equals(other.type);
            }
        }
        return false;
    }
}
