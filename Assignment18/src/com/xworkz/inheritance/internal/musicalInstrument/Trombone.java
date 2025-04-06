package com.xworkz.inheritance.internal.musicalInstrument;

public class Trombone extends MusicalInstrument {
    @Override
    public void tune() {
        System.out.println("Tuning Trombone");
    }

    @Override
    public void play() {
        System.out.println("Playing Trombone");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning Trombone");
    }

    @Override
    public void store() {
        System.out.println("Storing Trombone");
    }

    @Override
    public void repair() {
        System.out.println("Repairing Trombone");
    }
}
