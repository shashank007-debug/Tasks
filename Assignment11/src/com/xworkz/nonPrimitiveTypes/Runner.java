package com.xworkz.nonPrimitiveTypes;

public class Runner {
    public static void main(String[] args) {
        RCB rcb = new RCB();
        Cup cup = new Cup();
        cup.won(rcb);
        System.out.println("=======================================================");
        Display display = new Display();
        Shop shop = new Shop();
        shop.ads(display);
        System.out.println("=======================================================");
        Poster poster = new Poster();
        Theater theater = new Theater();
        theater.show(poster);
        System.out.println("=======================================================");
        Rocket rocket = new Rocket();
        Space space = new Space();
        space.explore(rocket);
        System.out.println("=======================================================");
        Dolo650 dolo650 = new Dolo650();
        Human human = new Human();
        human.headache(dolo650);
        System.out.println("=======================================================");
        Barber barber = new Barber();
        human.longHair(barber);
        human.longBeard(barber);
        System.out.println("=======================================================");
        Camera camera = new Camera();
        human.photos(camera);
        System.out.println("=======================================================");
        Mango mango = new Mango();
        human.hungry(mango);
        System.out.println("=======================================================");
        Pillow pillow = new Pillow();
        human.sleepy(pillow);
        System.out.println("=======================================================");
    }
}
