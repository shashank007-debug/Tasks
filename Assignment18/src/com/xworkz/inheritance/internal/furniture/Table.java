package com.xworkz.inheritance.internal.furniture;

public class Table extends Furniture {
    @Override
    public void assemble() {
        System.out.println("Assembling Table");
    }

    @Override
    public void disassemble() {
        System.out.println("Disassembling Table");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning Table");
    }

    @Override
    public void move() {
        System.out.println("Moving Table");
    }

    @Override
    public void repair() {
        System.out.println("Repairing Table");
    }
}
