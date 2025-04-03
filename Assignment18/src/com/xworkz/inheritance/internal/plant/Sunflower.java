package com.xworkz.inheritance.internal.plant;

public class Sunflower extends Plant {
    public void trackSun() {
        super.water();
        super.grow();
        super.prune();
        super.fertilize();
        super.harvest();
        System.out.println("Sunflower tracking sun");
    }
}