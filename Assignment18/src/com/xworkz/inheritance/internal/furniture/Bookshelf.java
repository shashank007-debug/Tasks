package com.xworkz.inheritance.internal.furniture;

public class Bookshelf extends Furniture {
    public void storeBooks() {
        super.assemble();
        super.disassemble();
        super.clean();
        super.move();
        super.repair();
        System.out.println("Bookshelf storing books");
    }
}