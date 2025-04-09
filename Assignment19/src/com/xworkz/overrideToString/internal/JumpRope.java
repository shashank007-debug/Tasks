package com.xworkz.overrideToString.internal;

public class JumpRope {
    private String brand;
    private String model;
    private String type;

    public JumpRope(String brand, String model, String type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    @Override
    public String toString() {
        return "JumpRope [brand=" + brand + ", model=" + model + ", type=" + type + "]";
    }
}
