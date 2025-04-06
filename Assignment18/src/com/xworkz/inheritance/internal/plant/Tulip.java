package com.xworkz.inheritance.internal.plant;

public class Tulip extends Plant {
    @Override
    public void water() {
        System.out.println("Watering Tulip");
    }

    @Override
    public void grow() {
        System.out.println("Tulip growing");
    }

    @Override
    public void prune() {
        System.out.println("Pruning Tulip");
    }

    @Override
    public void fertilize() {
        System.out.println("Fertilizing Tulip");
    }

    @Override
    public void harvest() {
        System.out.println("Harvesting Tulip");
    }
}
