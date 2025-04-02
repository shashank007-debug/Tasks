package com.xworkz.inheritance.internal.furniture;

public class Dresser extends Furniture {
    public void organizeClothes() {
        super.assemble();
        super.disassemble();
        super.clean();
        super.move();
        super.repair();
        System.out.println("Dresser organizing clothes");
    }
}