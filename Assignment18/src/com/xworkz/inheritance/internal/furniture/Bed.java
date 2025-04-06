package com.xworkz.inheritance.internal.furniture;

public class Bed extends Furniture {
    @Override
    public void assemble() {
        System.out.println("Assembling Bed");
    }

    @Override
    public void disassemble() {
        System.out.println("Disassembling Bed");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning Bed");
    }

    @Override
    public void move() {
        System.out.println("Moving Bed");
    }

    @Override
    public void repair() {
        System.out.println("Repairing Bed");
    }
}
