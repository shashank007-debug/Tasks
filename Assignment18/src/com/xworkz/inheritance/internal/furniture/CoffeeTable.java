package com.xworkz.inheritance.internal.furniture;

public class CoffeeTable extends Furniture {
    public void placeDrinks() {
        super.assemble();
        super.disassemble();
        super.clean();
        super.move();
        super.repair();
        System.out.println("CoffeeTable placing drinks");
    }
}
