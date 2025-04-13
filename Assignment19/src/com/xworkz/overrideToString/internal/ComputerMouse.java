package com.xworkz.overrideToString.internal;

public class ComputerMouse {
    private String brand;
    private String model;
    private int dpi;

    public ComputerMouse(String brand, String model, int dpi) {
        this.brand = brand;
        this.model = model;
        this.dpi = dpi;
    }

    @Override
    public String toString() {
        return "ComputerMouse [brand=" + brand + ", model=" + model + ", dpi=" + dpi + "]";
    }
    @Override
    public int hashCode() {
        return 16;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(obj instanceof ComputerMouse){
                ComputerMouse obj1 = this;
                ComputerMouse obj2 = (ComputerMouse) obj;
                return(obj1.model.equals(obj2.model));
            }
        }
        return false;
    }
}
