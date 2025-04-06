package com.xworkz.inheritance.internal.furniture;

public class Wardrobe extends Furniture {
    @Override
    public void assemble() {
        System.out.println("Assembling Wardrobe");
    }

    @Override
    public void disassemble() {
        System.out.println("Disassembling Wardrobe");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning Wardrobe");
    }

    @Override
    public void move() {
        System.out.println("Moving Wardrobe");
    }

    @Override
    public void repair() {
        System.out.println("Repairing Wardrobe");
    }
}
