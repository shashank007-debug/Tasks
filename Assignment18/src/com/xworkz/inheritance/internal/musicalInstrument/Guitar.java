package com.xworkz.inheritance.internal.musicalInstrument;

public class Guitar extends MusicalInstrument {
    @Override
    public void tune() {
        System.out.println("Tuning Guitar");
    }

    @Override
    public void play() {
        System.out.println("Playing Guitar");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning Guitar");
    }

    @Override
    public void store() {
        System.out.println("Storing Guitar");
    }

    @Override
    public void repair() {
        System.out.println("Repairing Guitar");
    }
}
