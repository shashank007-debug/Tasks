package com.xworkz.inheritance.internal.musicalInstrument;

public class Cello extends MusicalInstrument {
    public void vibrato() {
        super.tune();
        super.play();
        super.clean();
        super.store();
        super.repair();
        System.out.println("Cello vibrato");
    }
}