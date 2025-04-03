package com.xworkz.inheritance.internal.plant;

public class Pine extends Plant {
    public void dropCones() {
        super.water();
        super.grow();
        super.prune();
        super.fertilize();
        super.harvest();
        System.out.println("Pine dropping cones");
    }
}