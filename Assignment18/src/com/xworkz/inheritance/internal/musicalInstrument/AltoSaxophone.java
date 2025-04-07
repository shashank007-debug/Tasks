package com.xworkz.inheritance.internal.musicalInstrument;

public class AltoSaxophone extends Saxophone {
    public AltoSaxophone() {
        System.out.println("Constructor of AltoSaxophone");
    }

    public void jazz() {
        System.out.println("Playing jazz on Alto Saxophone");
    }

    public void invokeAllInheritedMethods() {
        tune();
        play();
        clean();
        store();
        repair();
    }

    public void checkAndCast(Saxophone sax) {
        if (sax instanceof AltoSaxophone) {
            AltoSaxophone as = (AltoSaxophone) sax;
            as.jazz();
        } else {
            System.out.println("Not an AltoSaxophone");
        }
    }
}
