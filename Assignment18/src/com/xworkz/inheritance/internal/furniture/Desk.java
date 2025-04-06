package com.xworkz.inheritance.internal.furniture;

public class Desk extends Furniture {
    @Override
    public void assemble() {
        System.out.println("Assembling Desk");
    }

    @Override
    public void disassemble() {
        System.out.println("Disassembling Desk");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning Desk");
    }

    @Override
    public void move() {
        System.out.println("Moving Desk");
    }

    @Override
    public void repair() {
        System.out.println("Repairing Desk");
    }
}
