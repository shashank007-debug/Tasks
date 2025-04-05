package com.xworkz.inheritance.internal.animal;

public class Snake extends Animal {
    @Override
    public void eat(){
        System.out.println("Running eat in Snake");
    }
    @Override
    public void sleep() {
        System.out.println("Running sleep in Snake");
    }
    @Override
    public void move() {
        System.out.println("Running move in Snake");
    }
    @Override
    public void breathe() {
        System.out.println("Running breathe in Snake");
    }
    @Override
    public void makeSound() {
        System.out.println("Running makeSound in Snake");
    }
}