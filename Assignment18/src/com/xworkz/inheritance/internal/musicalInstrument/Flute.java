package com.xworkz.inheritance.internal.musicalInstrument;

public class Flute extends MusicalInstrument {
    @Override
    public void tune() {
        System.out.println("Tuning Flute");
    }

    @Override
    public void play() {
        System.out.println("Playing Flute");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning Flute");
    }

    @Override
    public void store() {
        System.out.println("Storing Flute");
    }

    @Override
    public void repair() {
        System.out.println("Repairing Flute");
    }
}
