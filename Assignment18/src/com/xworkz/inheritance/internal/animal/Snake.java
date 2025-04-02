package com.xworkz.inheritance.internal.animal;

public class Snake extends Animal {
    public void slither() {
        super.eat();
        super.sleep();
        super.move();
        super.breathe();
        super.makeSound();
        System.out.println("Snake slithering");
    }
}