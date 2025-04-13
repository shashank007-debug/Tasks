package com.xworkz.overrideToString.internal;

public class Camera {
    private String brand;
    private String model;
    private int megapixels;

    public Camera(String brand, String model, int megapixels) {
        this.brand = brand;
        this.model = model;
        this.megapixels = megapixels;
    }

    @Override
    public String toString() {
        return "Camera [brand=" + brand + ", model=" + model + ", megapixels=" + megapixels + "]";
    }
    @Override
    public int hashCode() {
        return 13;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(obj instanceof Camera){
                Camera obj1 = this;
                Camera obj2 = (Camera) obj;
                return(obj1.model.equals(obj2.model));
            }
        }
        return false;
    }
}