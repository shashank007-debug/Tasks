package com.xworkz.inheritance.internal.musicalInstrument;

public class JazzTrumpet extends Trumpet {
    public JazzTrumpet() {
        System.out.println("Constructor of JazzTrumpet");
    }

    public void blowTrumpet() {
        System.out.println("Blowing Jazz Trumpet");
    }

    public void invokeAllInheritedMethods() {
        tune();
        play();
        clean();
        store();
        repair();
    }

    public void checkAndCast(Trumpet trumpet) {
        if (trumpet instanceof JazzTrumpet) {
            JazzTrumpet jt = (JazzTrumpet) trumpet;
            jt.blowTrumpet();
        } else {
            System.out.println("Not a JazzTrumpet");
        }
    }
}
