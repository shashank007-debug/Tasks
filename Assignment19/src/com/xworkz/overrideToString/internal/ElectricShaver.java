package com.xworkz.overrideToString.internal;

public class ElectricShaver {
    private String brand;
    private String model;
    private String type;

    public ElectricShaver(String brand, String model, String type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    @Override
    public String toString() {
        return "ElectricShaver [brand=" + brand + ", model=" + model + ", type=" + type + "]";
    }
    @Override
    public int hashCode() {
        return 27;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(obj instanceof ElectricShaver){
                ElectricShaver obj1 = this;
                ElectricShaver obj2 = (ElectricShaver) obj;
                return(obj1.model.equals(obj2.model));
            }
        }
        return false;
    }
}
