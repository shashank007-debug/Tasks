package com.xworkz.inheritance.internal.furniture;

public class LuxurySofa extends Sofa {
    public void invokeAllInheritedMethods() {
        assemble();
        disassemble();
        clean();
        move();
        repair();
    }

    public void checkAndCast(Furniture furniture) {
        if (furniture instanceof LuxurySofa) {
            LuxurySofa obj = (LuxurySofa) furniture;
            obj.provideComfort();
        } else {
            System.out.println("Furniture is not an instance of LuxurySofa");
        }
    }

    public void provideComfort() {
        System.out.println("Providing comfort on LuxurySofa");
    }
}
