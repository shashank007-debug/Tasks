package com.xworkz.inheritance.internal.furniture;

public class Table extends Furniture {
    public void eatOn() {
        super.assemble();
        super.disassemble();
        super.clean();
        super.move();
        super.repair();
        System.out.println("Table eating on");
    }
}