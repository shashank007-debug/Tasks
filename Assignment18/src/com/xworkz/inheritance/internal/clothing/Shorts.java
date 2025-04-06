package com.xworkz.inheritance.internal.clothing;

public class Shorts extends Clothing {
    @Override
    public void wear() {
        System.out.println("Wearing Shorts");
    }

    @Override
    public void wash() {
        System.out.println("Washing Shorts");
    }

    @Override
    public void dry() {
        System.out.println("Drying Shorts");
    }

    @Override
    public void iron() {
        System.out.println("Ironing Shorts");
    }

    @Override
    public void fold() {
        System.out.println("Folding Shorts");
    }
}
