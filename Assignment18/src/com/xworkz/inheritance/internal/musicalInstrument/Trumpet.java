package com.xworkz.inheritance.internal.musicalInstrument;

public class Trumpet extends MusicalInstrument {
    public void buzz() {
        super.tune();
        super.play();
        super.clean();
        super.store();
        super.repair();
        System.out.println("Trumpet buzzing");
    }
}