package com.xworkz.inheritance.internal.furniture;

public class CompactNightstand extends Nightstand {
    public void invokeAllInheritedMethods() {
        assemble();
        disassemble();
        clean();
        move();
        repair();
    }

    public void checkAndCast(Furniture furniture) {
        if (furniture instanceof CompactNightstand) {
            CompactNightstand obj = (CompactNightstand) furniture;
            obj.placeLamp();
        } else {
            System.out.println("Furniture is not an instance of CompactNightstand");
        }
    }

    public void placeLamp() {
        System.out.println("Placing lamp on CompactNightstand");
    }
}
