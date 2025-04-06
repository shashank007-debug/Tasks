package com.xworkz.inheritance.internal.musicalInstrument;

public class Harp extends MusicalInstrument {
    @Override
    public void tune() {
        System.out.println("Tuning Harp");
    }

    @Override
    public void play() {
        System.out.println("Playing Harp");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning Harp");
    }

    @Override
    public void store() {
        System.out.println("Storing Harp");
    }

    @Override
    public void repair() {
        System.out.println("Repairing Harp");
    }
}
