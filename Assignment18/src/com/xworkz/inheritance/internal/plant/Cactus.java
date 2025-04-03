package com.xworkz.inheritance.internal.plant;

public class Cactus extends Plant {
    public void storeWater() {
        super.water();
        super.grow();
        super.prune();
        super.fertilize();
        super.harvest();
        System.out.println("Cactus storing water");
    }
}