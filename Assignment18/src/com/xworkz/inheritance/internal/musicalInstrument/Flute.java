package com.xworkz.inheritance.internal.musicalInstrument;

public class Flute extends MusicalInstrument {
    public void blow() {
        super.tune();
        super.play();
        super.clean();
        super.store();
        super.repair();
        System.out.println("Flute blowing");
    }
}