package com.xworkz.inheritance.runner;
import com.xworkz.inheritance.internal.*;
import com.xworkz.inheritance.internal.vehicle.*;
import com.xworkz.inheritance.internal.animal.*;
import com.xworkz.inheritance.internal.furniture.*;
import com.xworkz.inheritance.internal.electronicdevice.*;


public class Runner {
    public static void main(String[] args) {
        System.out.println("===== VEHICLE HIERARCHY =====");
        Vehicle vehicle = new Vehicle();
        vehicle.start();
        vehicle.stop();
        vehicle.accelerate();
        vehicle.brake();
        vehicle.honk();

        Car car = new Car();
        car.openTrunk();

        Truck truck = new Truck();
        truck.loadCargo();

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.wheelie();

        Bus bus = new Bus();
        bus.openDoors();

        Bicycle bicycle = new Bicycle();
        bicycle.ringBell();

        Boat boat = new Boat();
        boat.anchor();

        Airplane airplane = new Airplane();
        airplane.takeOff();

        Helicopter helicopter = new Helicopter();
        helicopter.hover();

        Train train = new Train();
        train.blowWhistle();

        Scooter scooter = new Scooter();
        scooter.fold();

        Submarine submarine = new Submarine();
        submarine.dive();

        System.out.println("\n===== ANIMAL HIERARCHY =====");
        Animal animal = new Animal();
        animal.eat(); animal.sleep(); animal.move(); animal.breathe(); animal.makeSound();

        Dog dog = new Dog();
        dog.bark();

        Cat cat = new Cat();
        cat.purr();

        Bird bird = new Bird();
        bird.fly();

        Fish fish = new Fish();
        fish.swim();

        Lion lion = new Lion();
        lion.roar();

        Elephant elephant = new Elephant();
        elephant.trumpet();

        Monkey monkey = new Monkey();
        monkey.climb();

        Snake snake = new Snake();
        snake.slither();

        Dolphin dolphin = new Dolphin();
        dolphin.jump();

        Kangaroo kangaroo = new Kangaroo();
        kangaroo.hop();

        Penguin penguin = new Penguin();
        penguin.slide();

        Wolf wolf = new Wolf();
        wolf.howl();

        Giraffe giraffe = new Giraffe();
        giraffe.stretch();

        Bear bear = new Bear();
        bear.hibernate();

        System.out.println("\n===== ELECTRONIC DEVICE HIERARCHY =====");
        ElectronicDevice electronicDevice = new ElectronicDevice();
        electronicDevice.powerOn(); electronicDevice.powerOff(); electronicDevice.charge();
        electronicDevice.updateSoftware(); electronicDevice.connectWifi();

        Smartphone smartphone = new Smartphone();
        smartphone.makeCall();

        Laptop laptop = new Laptop();
        laptop.type();

        Tablet tablet = new Tablet();
        tablet.draw();

        SmartWatch smartWatch = new SmartWatch();
        smartWatch.trackHeartRate();

        TV tv = new TV();
        tv.changeChannel();

        Router router = new Router();
        router.broadcastSignal();

        Camera camera = new Camera();
        camera.takePhoto();

        GameConsole gameConsole = new GameConsole();
        gameConsole.playGame();

        SmartSpeaker smartSpeaker = new SmartSpeaker();
        smartSpeaker.playMusic();

        System.out.println("\n===== FURNITURE HIERARCHY =====");
        Furniture furniture = new Furniture();
        furniture.assemble(); furniture.disassemble(); furniture.clean(); furniture.move(); furniture.repair();

        Chair chair = new Chair();
        chair.sit();

        Table table = new Table();
        table.eatOn();

        Sofa sofa = new Sofa();
        sofa.lounge();

        Bed bed = new Bed();
        bed.sleepOn();

        Desk desk = new Desk();
        desk.workAt();

        Bookshelf bookshelf = new Bookshelf();
        bookshelf.storeBooks();

        Wardrobe wardrobe = new Wardrobe();
        wardrobe.storeClothes();

        Cabinet cabinet = new Cabinet();
        cabinet.storeItems();

        Dresser dresser = new Dresser();
        dresser.organizeClothes();

        CoffeeTable coffeeTable = new CoffeeTable();
        coffeeTable.placeDrinks();

        Nightstand nightstand = new Nightstand();
        nightstand.placeLamp();
    }
}