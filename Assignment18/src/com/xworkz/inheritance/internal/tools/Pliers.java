package com.xworkz.inheritance.internal.tools;

public class Pliers extends Tool {
    @Override
    public void grip() {
        System.out.println("Gripping the Pliers");
    }

    @Override
    public void use() {
        System.out.println("Using the Pliers");
    }

    @Override
    public void sharpen() {
        System.out.println("Sharpening the Pliers");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the Pliers");
    }

    @Override
    public void store() {
        System.out.println("Storing the Pliers");
    }
}
