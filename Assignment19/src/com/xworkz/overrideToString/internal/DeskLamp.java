package com.xworkz.overrideToString.internal;

public class DeskLamp {
    private String brand;
    private String model;
    private String type;

    public DeskLamp(String brand, String model, String type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    @Override
    public String toString() {
        return "DeskLamp [brand=" + brand + ", model=" + model + ", type=" + type + "]";
    }
    @Override
    public int hashCode() {
        return 19;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(obj instanceof DeskLamp){
                DeskLamp obj1 = this;
                DeskLamp obj2 = (DeskLamp) obj;
                return(obj1.model.equals(obj2.model));
            }
        }
        return false;
    }
}
