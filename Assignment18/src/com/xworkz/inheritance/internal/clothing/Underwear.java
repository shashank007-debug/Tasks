package com.xworkz.inheritance.internal.clothing;

public class Underwear extends Clothing {
    public void layer() {
        super.wear();
        super.wash();
        super.dry();
        super.iron();
        super.fold();
        System.out.println("Underwear layering");
    }
}
