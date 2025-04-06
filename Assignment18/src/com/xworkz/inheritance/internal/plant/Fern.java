package com.xworkz.inheritance.internal.plant;

public class Fern extends Plant {
    @Override
    public void water() {
        System.out.println("Watering Fern");
    }

    @Override
    public void grow() {
        System.out.println("Fern growing");
    }

    @Override
    public void prune() {
        System.out.println("Pruning Fern");
    }

    @Override
    public void fertilize() {
        System.out.println("Fertilizing Fern");
    }

    @Override
    public void harvest() {
        System.out.println("Harvesting Fern");
    }
}
