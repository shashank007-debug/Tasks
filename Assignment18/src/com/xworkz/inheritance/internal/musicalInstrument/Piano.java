package com.xworkz.inheritance.internal.musicalInstrument;

public class Piano extends MusicalInstrument {
    @Override
    public void tune() {
        System.out.println("Tuning Piano");
    }

    @Override
    public void play() {
        System.out.println("Playing Piano");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning Piano");
    }

    @Override
    public void store() {
        System.out.println("Storing Piano");
    }

    @Override
    public void repair() {
        System.out.println("Repairing Piano");
    }
}
