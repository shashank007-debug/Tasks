package com.xworkz.inheritance.internal.animal;

public class Lion extends Animal {
    @Override
    public void eat(){
        System.out.println("Running eat in Lion");
    }
    @Override
    public void sleep() {
        System.out.println("Running sleep in Lion");
    }
    @Override
    public void move() {
        System.out.println("Running move in Lion");
    }
    @Override
    public void breathe() {
        System.out.println("Running breathe in Lion");
    }
    @Override
    public void makeSound() {
        System.out.println("Running makeSound in Lion");
    }
}