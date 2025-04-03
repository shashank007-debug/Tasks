package com.xworkz.inheritance.internal.plant;

public class Oak extends Plant {
    public void shedLeaves() {
        super.water();
        super.grow();
        super.prune();
        super.fertilize();
        super.harvest();
        System.out.println("Oak shedding leaves");
    }
}