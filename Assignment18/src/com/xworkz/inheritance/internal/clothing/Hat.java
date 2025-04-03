package com.xworkz.inheritance.internal.clothing;

public class Hat extends Clothing {
    public void tip() {
        super.wear();
        super.wash();
        super.dry();
        super.iron();
        super.fold();
        System.out.println("Hat tipping");
    }
}