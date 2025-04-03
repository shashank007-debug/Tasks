package com.xworkz.inheritance.internal.clothing;

public class Skirt extends Clothing {
    public void twirl() {
        super.wear();
        super.wash();
        super.dry();
        super.iron();
        super.fold();
        System.out.println("Skirt twirling");
    }
}