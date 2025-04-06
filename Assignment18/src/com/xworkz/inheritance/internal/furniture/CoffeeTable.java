package com.xworkz.inheritance.internal.furniture;

public class CoffeeTable extends Furniture {
    @Override
    public void assemble() {
        System.out.println("Assembling Coffee Table");
    }

    @Override
    public void disassemble() {
        System.out.println("Disassembling Coffee Table");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning Coffee Table");
    }

    @Override
    public void move() {
        System.out.println("Moving Coffee Table");
    }

    @Override
    public void repair() {
        System.out.println("Repairing Coffee Table");
    }
}
