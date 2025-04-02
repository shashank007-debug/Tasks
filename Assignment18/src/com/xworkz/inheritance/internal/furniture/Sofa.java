package com.xworkz.inheritance.internal.furniture;

public class Sofa extends Furniture {
    public void lounge() {
        super.assemble();
        super.disassemble();
        super.clean();
        super.move();
        super.repair();
        System.out.println("Sofa lounging");
    }
}
