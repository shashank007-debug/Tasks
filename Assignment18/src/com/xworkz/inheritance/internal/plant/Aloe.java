package com.xworkz.inheritance.internal.plant;

public class Aloe extends Plant {
    @Override
    public void water() {
        System.out.println("Watering Aloe");
    }

    @Override
    public void grow() {
        System.out.println("Aloe growing");
    }

    @Override
    public void prune() {
        System.out.println("Pruning Aloe");
    }

    @Override
    public void fertilize() {
        System.out.println("Fertilizing Aloe");
    }

    @Override
    public void harvest() {
        System.out.println("Harvesting Aloe");
    }
}
