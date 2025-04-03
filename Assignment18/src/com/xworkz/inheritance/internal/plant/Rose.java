package com.xworkz.inheritance.internal.plant;

public class Rose extends Plant {
    public void bloom() {
        super.water();
        super.grow();
        super.prune();
        super.fertilize();
        super.harvest();
        System.out.println("Rose blooming");
    }
}