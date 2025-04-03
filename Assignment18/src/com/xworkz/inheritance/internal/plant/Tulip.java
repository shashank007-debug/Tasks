package com.xworkz.inheritance.internal.plant;

public class Tulip extends Plant {
    public void openPetals() {
        super.water();
        super.grow();
        super.prune();
        super.fertilize();
        super.harvest();
        System.out.println("Tulip opening petals");
    }
}