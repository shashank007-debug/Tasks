package com.xworkz.inheritance.internal.plant;

public class Aloe extends Plant {
    public void soothe() {
        super.water();
        super.grow();
        super.prune();
        super.fertilize();
        super.harvest();
        System.out.println("Aloe soothing");
    }
}