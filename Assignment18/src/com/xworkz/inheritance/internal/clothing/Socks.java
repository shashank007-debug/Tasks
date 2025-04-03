package com.xworkz.inheritance.internal.clothing;

public class Socks extends Clothing {
    public void pair() {
        super.wear();
        super.wash();
        super.dry();
        super.iron();
        super.fold();
        System.out.println("Socks pairing");
    }
}