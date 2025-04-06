package com.xworkz.inheritance.internal.musicalInstrument;

public class Saxophone extends MusicalInstrument {
    @Override
    public void tune() {
        System.out.println("Tuning Saxophone");
    }

    @Override
    public void play() {
        System.out.println("Playing Saxophone");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning Saxophone");
    }

    @Override
    public void store() {
        System.out.println("Storing Saxophone");
    }

    @Override
    public void repair() {
        System.out.println("Repairing Saxophone");
    }
}
