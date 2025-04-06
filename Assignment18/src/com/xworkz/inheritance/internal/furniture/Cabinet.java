package com.xworkz.inheritance.internal.furniture;

public class Cabinet extends Furniture {
    @Override
    public void assemble() {
        System.out.println("Assembling Cabinet");
    }

    @Override
    public void disassemble() {
        System.out.println("Disassembling Cabinet");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning Cabinet");
    }

    @Override
    public void move() {
        System.out.println("Moving Cabinet");
    }

    @Override
    public void repair() {
        System.out.println("Repairing Cabinet");
    }
}
