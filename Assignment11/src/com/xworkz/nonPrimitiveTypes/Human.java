package com.xworkz.nonPrimitiveTypes;

public class Human {
    void headache(Dolo650 dolo650) {
        if (dolo650 != null) {
            dolo650.consume();
            System.out.println("Taking Dolo650 for headache.");
        } else {
            System.out.println("No medicine available for headache.");
        }
    }

    void longHair(Barber barber) {
        if (barber != null) {
            barber.cutHair();
            System.out.println("Cutting long hair.");
        } else {
            System.out.println("No barber available for haircut.");
        }
    }

    void longBeard(Barber barber) {
        if (barber != null) {
            barber.shave();
            System.out.println("Shaving beard.");
        } else {
            System.out.println("No barber available for shaving.");
        }
    }

    void photos(Camera camera) {
        if (camera != null) {
            camera.clickPhoto();
            System.out.println("Clicking photo of human.");
        } else {
            System.out.println("No camera available for taking photos.");
        }
    }

    void hungry(Mango mango) {
        if (mango != null) {
            mango.eat();
            System.out.println("Human eating mango.");
        } else {
            System.out.println("No mango available to eat.");
        }
    }

    void sleepy(Pillow pillow) {
        if (pillow != null) {
            pillow.sleep();
            System.out.println("Human sleeping on pillow.");
        } else {
            System.out.println("No pillow available for sleeping.");
        }
    }
}
