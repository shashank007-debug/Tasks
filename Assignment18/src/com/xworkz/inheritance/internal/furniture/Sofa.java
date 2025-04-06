package com.xworkz.inheritance.internal.furniture;

public class Sofa extends Furniture {
    @Override
    public void assemble() {
        System.out.println("Assembling Sofa");
    }

    @Override
    public void disassemble() {
        System.out.println("Disassembling Sofa");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning Sofa");
    }

    @Override
    public void move() {
        System.out.println("Moving Sofa");
    }

    @Override
    public void repair() {
        System.out.println("Repairing Sofa");
    }
}
