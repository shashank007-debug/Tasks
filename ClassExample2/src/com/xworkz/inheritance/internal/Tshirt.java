package com.xworkz.inheritance.internal;

public class Tshirt {
    private String brand;
    private String size;
    private String color;
    public Tshirt(String brand, String size, String color){
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("Ref is not null");
            if(obj instanceof Tshirt){
                Tshirt tshirt1 = this;
                Tshirt tshirt2 = (Tshirt)obj;
                return (tshirt1.size.equals(tshirt2.size) && tshirt1.color.equals(tshirt2.color) && tshirt1.brand.equals(tshirt2.brand));
            }
        }
        return false;

    }
}
