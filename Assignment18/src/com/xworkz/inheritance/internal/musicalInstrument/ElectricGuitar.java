package com.xworkz.inheritance.internal.musicalInstrument;

public class ElectricGuitar extends Guitar {
    public ElectricGuitar() {
        System.out.println("Constructor of ElectricGuitar");
    }

    public void strumChords() {
        System.out.println("Strumming chords on Electric Guitar");
    }

    public void invokeAllInheritedMethods() {
        tune();
        play();
        clean();
        store();
        repair();
    }

    public void checkAndCast(Guitar guitar) {
        if (guitar instanceof ElectricGuitar) {
            ElectricGuitar eg = (ElectricGuitar) guitar;
            eg.strumChords();
        } else {
            System.out.println("Provided object is not an instance of ElectricGuitar");
        }
    }
}
