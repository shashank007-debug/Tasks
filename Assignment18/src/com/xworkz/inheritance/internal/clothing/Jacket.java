package com.xworkz.inheritance.internal.clothing;

public class Jacket extends Clothing {
    @Override
    public void wear() {
        System.out.println("Wearing Jacket");
    }

    @Override
    public void wash() {
        System.out.println("Washing Jacket");
    }

    @Override
    public void dry() {
        System.out.println("Drying Jacket");
    }

    @Override
    public void iron() {
        System.out.println("Ironing Jacket");
    }

    @Override
    public void fold() {
        System.out.println("Folding Jacket");
    }
}
