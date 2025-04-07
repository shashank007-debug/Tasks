package com.xworkz.inheritance.internal.furniture;

public class KingSizeBed extends Bed {

    public void invokeAllInheritedMethods() {
        assemble();
        disassemble();
        clean();
        move();
        repair();
    }

    public void checkAndCast(Furniture furniture) {
        if (furniture instanceof KingSizeBed) {
            KingSizeBed bed = (KingSizeBed) furniture;
            bed.adjustBackrest();
        } else {
            System.out.println("Furniture is not an instance of KingSizeBed");
        }
    }

    public void adjustBackrest() {
        System.out.println("Adjusting backrest of KingSizeBed");
    }
}
