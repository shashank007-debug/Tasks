package com.xworkz.inheritance.internal.clothing;

public class Jacket extends Clothing {
    public void zip() {
        super.wear();
        super.wash();
        super.dry();
        super.iron();
        super.fold();
        System.out.println("Jacket zipping");
    }
}