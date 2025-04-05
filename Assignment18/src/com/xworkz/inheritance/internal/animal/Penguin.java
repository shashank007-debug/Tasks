package com.xworkz.inheritance.internal.animal;

public class Penguin extends Animal {
    @Override
    public void eat(){
        System.out.println("Running eat in Penguin");
    }
    @Override
    public void sleep() {
        System.out.println("Running sleep in Penguin");
    }
    @Override
    public void move() {
        System.out.println("Running move in Penguin");
    }
    @Override
    public void breathe() {
        System.out.println("Running breathe in Penguin");
    }
    @Override
    public void makeSound() {
        System.out.println("Running makeSound in Penguin");
    }
}