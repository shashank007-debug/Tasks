package com.xworkz.inheritance.internal.clothing;

public class Sweater extends Clothing {
    @Override
    public void wear() {
        System.out.println("Wearing Sweater");
    }

    @Override
    public void wash() {
        System.out.println("Washing Sweater");
    }

    @Override
    public void dry() {
        System.out.println("Drying Sweater");
    }

    @Override
    public void iron() {
        System.out.println("Ironing Sweater");
    }

    @Override
    public void fold() {
        System.out.println("Folding Sweater");
    }
}
