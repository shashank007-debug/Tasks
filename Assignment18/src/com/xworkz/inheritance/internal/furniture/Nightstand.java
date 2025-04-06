package com.xworkz.inheritance.internal.furniture;

public class Nightstand extends Furniture {
    @Override
    public void assemble() {
        System.out.println("Assembling Nightstand");
    }

    @Override
    public void disassemble() {
        System.out.println("Disassembling Nightstand");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning Nightstand");
    }

    @Override
    public void move() {
        System.out.println("Moving Nightstand");
    }

    @Override
    public void repair() {
        System.out.println("Repairing Nightstand");
    }
}
