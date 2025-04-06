package com.xworkz.inheritance.internal.plant;

public class Sunflower extends Plant {
    @Override
    public void water() {
        System.out.println("Watering Sunflower");
    }

    @Override
    public void grow() {
        System.out.println("Sunflower growing");
    }

    @Override
    public void prune() {
        System.out.println("Pruning Sunflower");
    }

    @Override
    public void fertilize() {
        System.out.println("Fertilizing Sunflower");
    }

    @Override
    public void harvest() {
        System.out.println("Harvesting Sunflower");
    }
}
