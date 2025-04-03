package com.xworkz.inheritance.internal.plant;

public class Maple extends Plant {
    public void changeColor() {
        super.water();
        super.grow();
        super.prune();
        super.fertilize();
        super.harvest();
        System.out.println("Maple changing color");
    }
}