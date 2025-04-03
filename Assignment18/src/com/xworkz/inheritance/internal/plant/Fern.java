package com.xworkz.inheritance.internal.plant;

public class Fern extends Plant {
    public void unfurl() {
        super.water();
        super.grow();
        super.prune();
        super.fertilize();
        super.harvest();
        System.out.println("Fern unfurling");
    }
}