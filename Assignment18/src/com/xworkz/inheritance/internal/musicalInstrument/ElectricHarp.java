package com.xworkz.inheritance.internal.musicalInstrument;

public class ElectricHarp extends Harp {
    public ElectricHarp() {
        System.out.println("Constructor of ElectricHarp");
    }

    public void pluck() {
        System.out.println("Plucking Electric Harp");
    }

    public void invokeAllInheritedMethods() {
        tune();
        play();
        clean();
        store();
        repair();
    }

    public void checkAndCast(Harp harp) {
        if (harp instanceof ElectricHarp) {
            ElectricHarp eh = (ElectricHarp) harp;
            eh.pluck();
        } else {
            System.out.println("Not an ElectricHarp");
        }
    }
}