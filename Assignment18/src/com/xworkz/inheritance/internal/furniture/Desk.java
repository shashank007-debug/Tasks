package com.xworkz.inheritance.internal.furniture;


public class Desk extends Furniture {
    public void workAt() {
        super.assemble();
        super.disassemble();
        super.clean();
        super.move();
        super.repair();
        System.out.println("Desk working at");
    }
}