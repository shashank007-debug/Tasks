package com.xworkz.overrideToString.internal;

public class Blender {
    private String brand;
    private String model;
    private int speedSettings;

    public Blender(String brand, String model, int speedSettings) {
        this.brand = brand;
        this.model = model;
        this.speedSettings = speedSettings;
    }

    @Override
    public String toString() {
        return "Blender [brand=" + brand + ", model=" + model + ", speedSettings=" + speedSettings + "]";
    }

    @Override
    public int hashCode() {
        return 8;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(obj instanceof Blender){
                Blender obj1 = this;
                Blender obj2 = (Blender) obj;
                return(obj1.model.equals(obj2.model));
            }
        }
        return false;
    }
}
