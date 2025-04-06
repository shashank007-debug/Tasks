package com.xworkz.inheritance.internal.clothing;

public class Underwear extends Clothing {
    @Override
    public void wear() {
        System.out.println("Wearing Underwear");
    }

    @Override
    public void wash() {
        System.out.println("Washing Underwear");
    }

    @Override
    public void dry() {
        System.out.println("Drying Underwear");
    }

    @Override
    public void iron() {
        System.out.println("Ironing Underwear");
    }

    @Override
    public void fold() {
        System.out.println("Folding Underwear");
    }
}
