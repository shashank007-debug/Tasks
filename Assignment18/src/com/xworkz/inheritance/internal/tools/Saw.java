package com.xworkz.inheritance.internal.tools;

public class Saw extends Tool {
    @Override
    public void grip() {
        System.out.println("Gripping the Saw");
    }

    @Override
    public void use() {
        System.out.println("Using the Saw");
    }

    @Override
    public void sharpen() {
        System.out.println("Sharpening the Saw");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the Saw");
    }

    @Override
    public void store() {
        System.out.println("Storing the Saw");
    }
}
