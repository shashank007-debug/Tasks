package com.xworkz.inheritance.internal.tools;

public class Wrench extends Tool {
    @Override
    public void grip() {
        System.out.println("Gripping the Wrench");
    }

    @Override
    public void use() {
        System.out.println("Using the Wrench");
    }

    @Override
    public void sharpen() {
        System.out.println("Sharpening the Wrench");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the Wrench");
    }

    @Override
    public void store() {
        System.out.println("Storing the Wrench");
    }
}
