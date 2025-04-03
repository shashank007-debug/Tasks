package com.xworkz.inheritance.internal.clothing;

public class Jeans extends Clothing {
    public void rollCuffs() {
        super.wear();
        super.wash();
        super.dry();
        super.iron();
        super.fold();
        System.out.println("Jeans rolling cuffs");
    }
}