package com.xworkz.inheritance.internal.furniture;

public class Chair extends Furniture {
    public void sit() {
        super.assemble();
        super.disassemble();
        super.clean();
        super.move();
        super.repair();
        System.out.println("Chair sitting");
    }
}