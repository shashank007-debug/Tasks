package com.xworkz.inheritance.internal.furniture;

public class Wardrobe extends Furniture {
    public void storeClothes() {
        super.assemble();
        super.disassemble();
        super.clean();
        super.move();
        super.repair();
        System.out.println("Wardrobe storing clothes");
    }
}