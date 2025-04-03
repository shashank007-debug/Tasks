package com.xworkz.inheritance.internal.musicalInstrument;

public class Harp extends MusicalInstrument {
    public void pluck() {
        super.tune();
        super.play();
        super.clean();
        super.store();
        super.repair();
        System.out.println("Harp plucking");
    }
}