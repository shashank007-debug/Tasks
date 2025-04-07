package com.xworkz.inheritance.internal.musicalInstrument;

public class GrandPiano extends Piano {
    public GrandPiano() {
        System.out.println("Constructor of GrandPiano");
    }

    public void pressKeys() {
        System.out.println("Pressing keys on Grand Piano");
    }

    public void invokeAllInheritedMethods() {
        tune();
        play();
        clean();
        store();
        repair();
    }

    public void checkAndCast(Piano piano) {
        if (piano instanceof GrandPiano) {
            GrandPiano gp = (GrandPiano) piano;
            gp.pressKeys();
        } else {
            System.out.println("Not a GrandPiano");
        }
    }
}