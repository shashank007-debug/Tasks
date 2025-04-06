package com.xworkz.inheritance.internal.clothing;

public class Shirt extends Clothing {
    @Override
    public void wear() {
        System.out.println("Wearing Shirt");
    }

    @Override
    public void wash() {
        System.out.println("Washing Shirt");
    }

    @Override
    public void dry() {
        System.out.println("Drying Shirt");
    }

    @Override
    public void iron() {
        System.out.println("Ironing Shirt");
    }

    @Override
    public void fold() {
        System.out.println("Folding Shirt");
    }
}
