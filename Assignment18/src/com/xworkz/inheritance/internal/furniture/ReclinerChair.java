package com.xworkz.inheritance.internal.furniture;

public class ReclinerChair extends Chair {
    public void invokeAllInheritedMethods() {
        assemble();
        disassemble();
        clean();
        move();
        repair();
    }

    public void checkAndCast(Furniture furniture) {
        if (furniture instanceof ReclinerChair) {
            ReclinerChair obj = (ReclinerChair) furniture;
            obj.recline();
        } else {
            System.out.println("Furniture is not an instance of ReclinerChair");
        }
    }

    public void recline() {
        System.out.println("Reclining ReclinerChair");
    }
}
