package com.xworkz.inheritance.internal.clothing;

public class Shorts extends Clothing {
    public void adjustWaist() {
        super.wear();
        super.wash();
        super.dry();
        super.iron();
        super.fold();
        System.out.println("Shorts adjusting waist");
    }
}