package com.xworkz.inheritance.internal.clothing;

public class Skirt extends Clothing {
    @Override
    public void wear() {
        System.out.println("Wearing Skirt");
    }

    @Override
    public void wash() {
        System.out.println("Washing Skirt");
    }

    @Override
    public void dry() {
        System.out.println("Drying Skirt");
    }

    @Override
    public void iron() {
        System.out.println("Ironing Skirt");
    }

    @Override
    public void fold() {
        System.out.println("Folding Skirt");
    }
}
