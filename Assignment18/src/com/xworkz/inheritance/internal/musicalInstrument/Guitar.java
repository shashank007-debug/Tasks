package com.xworkz.inheritance.internal.musicalInstrument;

public class Guitar extends MusicalInstrument {
    public void strum() {
        super.tune();
        super.play();
        super.clean();
        super.store();
        super.repair();
        System.out.println("Guitar strumming");
    }
}
