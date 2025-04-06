package com.xworkz.inheritance.internal.furniture;

public class Dresser extends Furniture {
    @Override
    public void assemble() {
        System.out.println("Assembling Dresser");
    }

    @Override
    public void disassemble() {
        System.out.println("Disassembling Dresser");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning Dresser");
    }

    @Override
    public void move() {
        System.out.println("Moving Dresser");
    }

    @Override
    public void repair() {
        System.out.println("Repairing Dresser");
    }
}
