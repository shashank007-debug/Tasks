package com.xworkz.inheritance.internal.musicalInstrument;

public class BassTrombone extends Trombone {
    public BassTrombone() {
        System.out.println("Constructor of BassTrombone");
    }

    public void slide() {
        System.out.println("Sliding Bass Trombone");
    }

    public void invokeAllInheritedMethods() {
        tune();
        play();
        clean();
        store();
        repair();
    }

    public void checkAndCast(Trombone tb) {
        if (tb instanceof BassTrombone) {
            BassTrombone bt = (BassTrombone) tb;
            bt.slide();
        } else {
            System.out.println("Not a BassTrombone");
        }
    }
}