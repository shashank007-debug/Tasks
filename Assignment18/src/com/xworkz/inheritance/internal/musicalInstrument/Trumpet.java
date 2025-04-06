package com.xworkz.inheritance.internal.musicalInstrument;

public class Trumpet extends MusicalInstrument {
    @Override
    public void tune() {
        System.out.println("Tuning Trumpet");
    }

    @Override
    public void play() {
        System.out.println("Playing Trumpet");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning Trumpet");
    }

    @Override
    public void store() {
        System.out.println("Storing Trumpet");
    }

    @Override
    public void repair() {
        System.out.println("Repairing Trumpet");
    }
}
