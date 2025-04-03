package com.xworkz.inheritance.internal.clothing;

public class Shirt extends Clothing {
    public void buttonUp() {
        super.wear();
        super.wash();
        super.dry();
        super.iron();
        super.fold();
        System.out.println("Shirt buttoning up");
    }
}