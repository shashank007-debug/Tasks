package com.xworkz.inheritance.internal.musicalInstrument;

public class Violin extends MusicalInstrument {
    public void bow() {
        super.tune();
        super.play();
        super.clean();
        super.store();
        super.repair();
        System.out.println("Violin bowing");
    }
}