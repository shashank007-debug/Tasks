package com.xworkz.inheritance.internal.clothing;

public class Dress extends Clothing {
    public void zipUp() {
        super.wear();
        super.wash();
        super.dry();
        super.iron();
        super.fold();
        System.out.println("Dress zipping up");
    }
}