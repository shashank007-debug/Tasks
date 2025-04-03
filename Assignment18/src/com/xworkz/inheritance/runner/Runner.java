package com.xworkz.inheritance.runner;
import com.xworkz.inheritance.internal.vehicle.*;
import com.xworkz.inheritance.internal.animal.*;
import com.xworkz.inheritance.internal.furniture.*;
import com.xworkz.inheritance.internal.electronicdevice.*;
import com.xworkz.inheritance.internal.musicalInstrument.*;
import com.xworkz.inheritance.internal.tools.*;
import com.xworkz.inheritance.internal.plant.*;
import com.xworkz.inheritance.internal.appliance.*;
import com.xworkz.inheritance.internal.clothing.*;


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
        animal.eat();
        animal.sleep();
        animal.move();
        animal.breathe();
        animal.makeSound();

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
        electronicDevice.powerOn();
        electronicDevice.powerOff();
        electronicDevice.charge();
        electronicDevice.updateSoftware();
        electronicDevice.connectWifi();

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
        furniture.assemble();
        furniture.disassemble();
        furniture.clean();
        furniture.move();
        furniture.repair();

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

        System.out.println("===== APPLIANCE HIERARCHY =====");

        Appliance appliance = new Appliance();
        appliance.plugIn();
        appliance.turnOn();
        appliance.turnOff();
        appliance.clean();
        appliance.repair();

        Appliance fridgeParentRef = new Refrigerator();
        fridgeParentRef.plugIn();
        fridgeParentRef.turnOn();
        fridgeParentRef.turnOff();
        fridgeParentRef.clean();
        fridgeParentRef.repair();

        Appliance microwaveParentRef = new Microwave();
        microwaveParentRef.plugIn();
        microwaveParentRef.turnOn();
        microwaveParentRef.turnOff();
        microwaveParentRef.clean();
        microwaveParentRef.repair();

        Refrigerator fridge = new Refrigerator();
        fridge.coolFood();

        Microwave microwave = new Microwave();
        microwave.heatFood();

        WashingMachine washer = new WashingMachine();
        washer.washClothes();

        Dishwasher dishwasher = new Dishwasher();
        dishwasher.washDishes();

        Oven oven = new Oven();
        oven.bake();

        Toaster toaster = new Toaster();
        toaster.toastBread();

        Blender blender = new Blender();
        blender.blend();

        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.brewCoffee();

        AirFryer airFryer = new AirFryer();
        airFryer.airFry();

        VacuumCleaner vacuum = new VacuumCleaner();
        vacuum.vacuum();

        System.out.println("\n===== CLOTHING HIERARCHY =====");
        Clothing clothing = new Clothing();
        clothing.wear();
        clothing.wash();
        clothing.dry();
        clothing.iron();
        clothing.fold();

        Clothing shirtParentRef = new Shirt();
        shirtParentRef.wear();
        shirtParentRef.wash();
        shirtParentRef.dry();
        shirtParentRef.iron();
        shirtParentRef.fold();

        Clothing jeansParentRef = new Jeans();
        jeansParentRef.wear();
        jeansParentRef.wash();
        jeansParentRef.dry();
        jeansParentRef.iron();
        jeansParentRef.fold();

        Shirt shirt = new Shirt();
        shirt.buttonUp();

        Jeans jeans = new Jeans();
        jeans.rollCuffs();

        Dress dress = new Dress();
        dress.zipUp();

        Jacket jacket = new Jacket();
        jacket.zip();

        Sweater sweater = new Sweater();
        sweater.knit();

        Shorts shorts = new Shorts();
        shorts.adjustWaist();

        Skirt skirt = new Skirt();
        skirt.twirl();

        Socks socks = new Socks();
        socks.pair();

        Underwear underwear = new Underwear();
        underwear.layer();

        Hat hat = new Hat();
        hat.tip();

        System.out.println("\n===== PLANT HIERARCHY =====");
        Plant plant = new Plant();
        plant.water();
        plant.grow();
        plant.prune();
        plant.fertilize();
        plant.harvest();

        Plant roseParentRef = new Rose();
        roseParentRef.water();
        roseParentRef.grow();
        roseParentRef.prune();
        roseParentRef.fertilize();
        roseParentRef.harvest();

        Plant oakParentRef = new Oak();
        oakParentRef.water();
        oakParentRef.grow();
        oakParentRef.prune();
        oakParentRef.fertilize();
        oakParentRef.harvest();

        Rose rose = new Rose();
        rose.bloom();

        Oak oak = new Oak();
        oak.shedLeaves();

        Tulip tulip = new Tulip();
        tulip.openPetals();

        Cactus cactus = new Cactus();
        cactus.storeWater();

        Pine pine = new Pine();
        pine.dropCones();

        Sunflower sunflower = new Sunflower();
        sunflower.trackSun();

        Bamboo bamboo = new Bamboo();
        bamboo.growTall();

        Fern fern = new Fern();
        fern.unfurl();

        Aloe aloe = new Aloe();
        aloe.soothe();

        Maple maple = new Maple();
        maple.changeColor();

        System.out.println("\n===== TOOL HIERARCHY =====");
        Tool tool = new Tool();
        tool.grip();
        tool.use();
        tool.sharpen();
        tool.clean();
        tool.store();

        Tool hammerParentRef = new Hammer();
        hammerParentRef.grip();
        hammerParentRef.use();
        hammerParentRef.sharpen();
        hammerParentRef.clean();
        hammerParentRef.store();

        Tool screwdriverParentRef = new Screwdriver();
        screwdriverParentRef.grip();
        screwdriverParentRef.use();
        screwdriverParentRef.sharpen();
        screwdriverParentRef.clean();
        screwdriverParentRef.store();

        Hammer hammer = new Hammer();
        hammer.nail();

        Screwdriver screwdriver = new Screwdriver();
        screwdriver.twist();

        Wrench wrench = new Wrench();
        wrench.tighten();

        Pliers pliers = new Pliers();
        pliers.clamp();

        Saw saw = new Saw();
        saw.cut();

        Drill drill = new Drill();
        drill.bore();

        Axe axe = new Axe();
        axe.chop();

        Shovel shovel = new Shovel();
        shovel.dig();

        Rake rake = new Rake();
        rake.gather();

        Chisel chisel = new Chisel();
        chisel.carve();

        System.out.println("\n===== MUSICAL INSTRUMENT HIERARCHY =====");
        MusicalInstrument instrument = new MusicalInstrument();
        instrument.tune();
        instrument.play();
        instrument.clean();
        instrument.store();
        instrument.repair();

        MusicalInstrument guitarParentRef = new Guitar();
        guitarParentRef.tune();
        guitarParentRef.play();
        guitarParentRef.clean();
        guitarParentRef.store();
        guitarParentRef.repair();

        MusicalInstrument pianoParentRef = new Piano();
        pianoParentRef.tune();
        pianoParentRef.play();
        pianoParentRef.clean();
        pianoParentRef.store();
        pianoParentRef.repair();

        Guitar guitar = new Guitar();
        guitar.strum();

        Piano piano = new Piano();
        piano.pressKeys();

        Violin violin = new Violin();
        violin.bow();

        Drums drums = new Drums();
        drums.beat();

        Flute flute = new Flute();
        flute.blow();

        Trumpet trumpet = new Trumpet();
        trumpet.buzz();

        Saxophone saxophone = new Saxophone();
        saxophone.reed();

        Cello cello = new Cello();
        cello.vibrato();

        Harp harp = new Harp();
        harp.pluck();

        Clarinet clarinet = new Clarinet();
        clarinet.reed();

        Trombone trombone = new Trombone();
        trombone.slide();


    }
}