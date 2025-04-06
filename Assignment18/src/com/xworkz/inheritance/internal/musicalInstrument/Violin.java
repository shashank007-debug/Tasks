package com.xworkz.inheritance.internal.musicalInstrument;

public class Violin extends MusicalInstrument {
    @Override
    public void tune() {
        System.out.println("Tuning Violin");
    }

    @Override
    public void play() {
        System.out.println("Playing Violin");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning Violin");
    }

    @Override
    public void store() {
        System.out.println("Storing Violin");
    }

    @Override
    public void repair() {
        System.out.println("Repairing Violin");
    }
}
