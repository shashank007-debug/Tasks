package com.xworkz.inheritance.internal.clothing;

public class Sweater extends Clothing {
    public void knit() {
        super.wear();
        super.wash();
        super.dry();
        super.iron();
        super.fold();
        System.out.println("Sweater knitting");
    }
}