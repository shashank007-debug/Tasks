package com.xworkz.inheritance.internal.musicalInstrument;

public class Clarinet extends MusicalInstrument {
    @Override
    public void tune() {
        System.out.println("Tuning Clarinet");
    }

    @Override
    public void play() {
        System.out.println("Playing Clarinet");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning Clarinet");
    }

    @Override
    public void store() {
        System.out.println("Storing Clarinet");
    }

    @Override
    public void repair() {
        System.out.println("Repairing Clarinet");
    }
}
