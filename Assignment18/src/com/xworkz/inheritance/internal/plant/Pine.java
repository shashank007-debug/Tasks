package com.xworkz.inheritance.internal.plant;

public class Pine extends Plant {
    @Override
    public void water() {
        System.out.println("Watering Pine");
    }

    @Override
    public void grow() {
        System.out.println("Pine growing");
    }

    @Override
    public void prune() {
        System.out.println("Pruning Pine");
    }

    @Override
    public void fertilize() {
        System.out.println("Fertilizing Pine");
    }

    @Override
    public void harvest() {
        System.out.println("Harvesting Pine");
    }
}
