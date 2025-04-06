package com.xworkz.inheritance.internal.clothing;

public class Dress extends Clothing {
    @Override
    public void wear() {
        System.out.println("Wearing Dress");
    }

    @Override
    public void wash() {
        System.out.println("Washing Dress");
    }

    @Override
    public void dry() {
        System.out.println("Drying Dress");
    }

    @Override
    public void iron() {
        System.out.println("Ironing Dress");
    }

    @Override
    public void fold() {
        System.out.println("Folding Dress");
    }
}
