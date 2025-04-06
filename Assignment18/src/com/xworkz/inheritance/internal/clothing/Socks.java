package com.xworkz.inheritance.internal.clothing;

public class Socks extends Clothing {
    @Override
    public void wear() {
        System.out.println("Wearing Socks");
    }

    @Override
    public void wash() {
        System.out.println("Washing Socks");
    }

    @Override
    public void dry() {
        System.out.println("Drying Socks");
    }

    @Override
    public void iron() {
        System.out.println("Ironing Socks");
    }

    @Override
    public void fold() {
        System.out.println("Folding Socks");
    }
}
