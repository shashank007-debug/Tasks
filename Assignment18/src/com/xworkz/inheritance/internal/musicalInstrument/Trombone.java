package com.xworkz.inheritance.internal.musicalInstrument;

public class Trombone extends MusicalInstrument {
    public void slide() {
        super.tune();
        super.play();
        super.clean();
        super.store();
        super.repair();
        System.out.println("Trombone sliding");
    }
}