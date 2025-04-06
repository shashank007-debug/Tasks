package com.xworkz.inheritance.internal.musicalInstrument;

public class Cello extends MusicalInstrument {
    @Override
    public void tune() {
        System.out.println("Tuning Cello");
    }

    @Override
    public void play() {
        System.out.println("Playing Cello");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning Cello");
    }

    @Override
    public void store() {
        System.out.println("Storing Cello");
    }

    @Override
    public void repair() {
        System.out.println("Repairing Cello");
    }
}
