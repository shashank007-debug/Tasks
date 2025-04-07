package com.xworkz.inheritance.internal.animal;

public class TallGiraffe extends Giraffe {
    public void specialGiraffeBehavior() {
        System.out.println("TallGiraffe reaches high trees");
    }
    public void invokeAllGiraffeMethods() {
        eat();
        sleep();
        move();
        breathe();
        makeSound(); }
    public void checkAndCast(Giraffe giraffe) {
        if (giraffe instanceof TallGiraffe) {
            TallGiraffe tg = (TallGiraffe) giraffe;
            System.out.println("Giraffe is TallGiraffe. Casting successful.");
            tg.specialGiraffeBehavior();
        } else System.out.println("Giraffe is not a TallGiraffe.");
    }
}