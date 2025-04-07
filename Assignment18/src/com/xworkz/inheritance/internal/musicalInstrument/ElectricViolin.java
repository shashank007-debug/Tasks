package com.xworkz.inheritance.internal.musicalInstrument;

public class ElectricViolin extends Violin {
    public ElectricViolin() {
        System.out.println("Constructor of ElectricViolin");
    }

    public void playSolo() {
        System.out.println("Playing solo on Electric Violin");
    }

    public void invokeAllInheritedMethods() {
        tune();
        play();
        clean();
        store();
        repair();
    }

    public void checkAndCast(Violin violin) {
        if (violin instanceof ElectricViolin) {
            ElectricViolin ev = (ElectricViolin) violin;
            ev.playSolo();
        } else {
            System.out.println("Not an ElectricViolin");
        }
    }
}