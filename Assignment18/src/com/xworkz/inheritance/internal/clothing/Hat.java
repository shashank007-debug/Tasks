package com.xworkz.inheritance.internal.clothing;

public class Hat extends Clothing {
    @Override
    public void wear() {
        System.out.println("Wearing Hat");
    }

    @Override
    public void wash() {
        System.out.println("Washing Hat");
    }

    @Override
    public void dry() {
        System.out.println("Drying Hat");
    }

    @Override
    public void iron() {
        System.out.println("Ironing Hat");
    }

    @Override
    public void fold() {
        System.out.println("Folding Hat");
    }
}
