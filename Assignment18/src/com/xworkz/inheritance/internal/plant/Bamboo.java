package com.xworkz.inheritance.internal.plant;

public class Bamboo extends Plant {
    @Override
    public void water() {
        System.out.println("Watering Bamboo");
    }

    @Override
    public void grow() {
        System.out.println("Bamboo growing");
    }

    @Override
    public void prune() {
        System.out.println("Pruning Bamboo");
    }

    @Override
    public void fertilize() {
        System.out.println("Fertilizing Bamboo");
    }

    @Override
    public void harvest() {
        System.out.println("Harvesting Bamboo");
    }
}
