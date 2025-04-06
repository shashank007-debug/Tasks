package com.xworkz.inheritance.internal.musicalInstrument;

public class Drums extends MusicalInstrument {
    @Override
    public void tune() {
        System.out.println("Tuning Drums");
    }

    @Override
    public void play() {
        System.out.println("Playing Drums");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning Drums");
    }

    @Override
    public void store() {
        System.out.println("Storing Drums");
    }

    @Override
    public void repair() {
        System.out.println("Repairing Drums");
    }
}
