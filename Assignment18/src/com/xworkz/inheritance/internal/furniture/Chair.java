package com.xworkz.inheritance.internal.furniture;

public class Chair extends Furniture {
    @Override
    public void assemble() {
        System.out.println("Assembling Chair");
    }

    @Override
    public void disassemble() {
        System.out.println("Disassembling Chair");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning Chair");
    }

    @Override
    public void move() {
        System.out.println("Moving Chair");
    }

    @Override
    public void repair() {
        System.out.println("Repairing Chair");
    }
}
