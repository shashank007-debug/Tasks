package com.xworkz.overrideToString.internal;

public class Briefcase {
    private String brand;
    private String model;
    private String material;

    public Briefcase(String brand, String model, String material) {
        this.brand = brand;
        this.model = model;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Briefcase [brand=" + brand + ", model=" + model + ", material=" + material + "]";
    }
    @Override
    public int hashCode() {
        return 11;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(obj instanceof Briefcase){
                Briefcase obj1 = this;
                Briefcase obj2 = (Briefcase) obj;
                return(obj1.model.equals(obj2.model));
            }
        }
        return false;
    }
}
