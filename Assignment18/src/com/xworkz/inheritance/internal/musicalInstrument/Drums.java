package com.xworkz.inheritance.internal.musicalInstrument;

public class Drums extends MusicalInstrument {
    public void beat() {
        super.tune();
        super.play();
        super.clean();
        super.store();
        super.repair();
        System.out.println("Drums beating");
    }
}