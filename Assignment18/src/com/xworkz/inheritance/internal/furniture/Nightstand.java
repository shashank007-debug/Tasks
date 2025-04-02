package com.xworkz.inheritance.internal.furniture;

public class Nightstand extends Furniture {
    public void placeLamp() {
        super.assemble();
        super.disassemble();
        super.clean();
        super.move();
        super.repair();
        System.out.println("Nightstand placing lamp");
    }
}