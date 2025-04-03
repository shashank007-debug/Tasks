package com.xworkz.inheritance.internal.plant;

public class Bamboo extends Plant {
    public void growTall() {
        super.water();
        super.grow();
        super.prune();
        super.fertilize();
        super.harvest();
        System.out.println("Bamboo growing tall");
    }
}