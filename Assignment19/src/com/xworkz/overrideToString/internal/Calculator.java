package com.xworkz.overrideToString.internal;

public class Calculator {
    private String brand;
    private String model;
    private String type;

    public Calculator(String brand, String model, String type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Calculator [brand=" + brand + ", model=" + model + ", type=" + type + "]";
    }
    @Override
    public int hashCode() {
        return 12;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(obj instanceof Calculator){
                Calculator obj1 = this;
                Calculator obj2 = (Calculator) obj;
                return(obj1.model.equals(obj2.model));
            }
        }
        return false;
    }
}
