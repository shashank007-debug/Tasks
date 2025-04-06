package com.xworkz.inheritance.internal.clothing;

public class Jeans extends Clothing {
    @Override
    public void wear() {
        System.out.println("Wearing Jeans");
    }

    @Override
    public void wash() {
        System.out.println("Washing Jeans");
    }

    @Override
    public void dry() {
        System.out.println("Drying Jeans");
    }

    @Override
    public void iron() {
        System.out.println("Ironing Jeans");
    }

    @Override
    public void fold() {
        System.out.println("Folding Jeans");
    }
}
