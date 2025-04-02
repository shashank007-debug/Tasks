package com.xworkz.inheritance.internal.furniture;

public class Cabinet extends Furniture {
    public void storeItems() {
        super.assemble();
        super.disassemble();
        super.clean();
        super.move();
        super.repair();
        System.out.println("Cabinet storing items");
    }
}
