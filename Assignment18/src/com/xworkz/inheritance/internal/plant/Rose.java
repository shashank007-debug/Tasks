package com.xworkz.inheritance.internal.plant;

public class Rose extends Plant {
    @Override
    public void water() {
        System.out.println("Watering Rose");
    }

    @Override
    public void grow() {
        System.out.println("Rose growing");
    }

    @Override
    public void prune() {
        System.out.println("Pruning Rose");
    }

    @Override
    public void fertilize() {
        System.out.println("Fertilizing Rose");
    }

    @Override
    public void harvest() {
        System.out.println("Harvesting Rose");
    }
}
