package com.xworkz.inheritance.internal.furniture;

public class Bookshelf extends Furniture {
    @Override
    public void assemble() {
        System.out.println("Assembling Bookshelf");
    }

    @Override
    public void disassemble() {
        System.out.println("Disassembling Bookshelf");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning Bookshelf");
    }

    @Override
    public void move() {
        System.out.println("Moving Bookshelf");
    }

    @Override
    public void repair() {
        System.out.println("Repairing Bookshelf");
    }
}
