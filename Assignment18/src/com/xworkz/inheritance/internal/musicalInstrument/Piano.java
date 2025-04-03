package com.xworkz.inheritance.internal.musicalInstrument;

public class Piano extends MusicalInstrument {
    public void pressKeys() {
        super.tune();
        super.play();
        super.clean();
        super.store();
        super.repair();
        System.out.println("Piano pressing keys");
    }
}