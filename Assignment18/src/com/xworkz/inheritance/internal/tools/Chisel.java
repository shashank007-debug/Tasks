package com.xworkz.inheritance.internal.tools;

public class Chisel extends Tool {
    @Override
    public void grip() {
        System.out.println("Gripping the Chisel");
    }

    @Override
    public void use() {
        System.out.println("Using the Chisel");
    }

    @Override
    public void sharpen() {
        System.out.println("Sharpening the Chisel");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the Chisel");
    }

    @Override
    public void store() {
        System.out.println("Storing the Chisel");
    }
}
