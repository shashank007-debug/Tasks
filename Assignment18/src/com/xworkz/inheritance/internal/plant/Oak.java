package com.xworkz.inheritance.internal.plant;

public class Oak extends Plant {
    @Override
    public void water() {
        System.out.println("Watering Oak");
    }

    @Override
    public void grow() {
        System.out.println("Oak growing");
    }

    @Override
    public void prune() {
        System.out.println("Pruning Oak");
    }

    @Override
    public void fertilize() {
        System.out.println("Fertilizing Oak");
    }

    @Override
    public void harvest() {
        System.out.println("Harvesting Oak");
    }
}
