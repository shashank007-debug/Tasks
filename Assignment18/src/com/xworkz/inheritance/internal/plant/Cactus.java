package com.xworkz.inheritance.internal.plant;

public class Cactus extends Plant {
    @Override
    public void water() {
        System.out.println("Watering Cactus");
    }

    @Override
    public void grow() {
        System.out.println("Cactus growing");
    }

    @Override
    public void prune() {
        System.out.println("Pruning Cactus");
    }

    @Override
    public void fertilize() {
        System.out.println("Fertilizing Cactus");
    }

    @Override
    public void harvest() {
        System.out.println("Harvesting Cactus");
    }
}
