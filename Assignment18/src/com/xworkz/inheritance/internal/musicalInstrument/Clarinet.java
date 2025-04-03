package com.xworkz.inheritance.internal.musicalInstrument;

public class Clarinet extends MusicalInstrument {
    public void reed() {
        super.tune();
        super.play();
        super.clean();
        super.store();
        super.repair();
        System.out.println("Clarinet reeding");
    }
}