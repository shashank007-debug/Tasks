package com.xworkz.inheritance.internal.tools;

public class Rake extends Tool {
    @Override
    public void grip() {
        System.out.println("Gripping the Rake");
    }

    @Override
    public void use() {
        System.out.println("Using the Rake");
    }

    @Override
    public void sharpen() {
        System.out.println("Sharpening the Rake");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the Rake");
    }

    @Override
    public void store() {
        System.out.println("Storing the Rake");
    }
}
