package com.xworkz.inheritance.internal.plant;

public class Maple extends Plant {
    @Override
    public void water() {
        System.out.println("Watering Maple");
    }

    @Override
    public void grow() {
        System.out.println("Maple growing");
    }

    @Override
    public void prune() {
        System.out.println("Pruning Maple");
    }

    @Override
    public void fertilize() {
        System.out.println("Fertilizing Maple");
    }

    @Override
    public void harvest() {
        System.out.println("Harvesting Maple");
    }
}
