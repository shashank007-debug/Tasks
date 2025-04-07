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
        System.out.println("\n===== VEHICLE HIERARCHY =====");

        Vehicle vehicle = new Vehicle();
        vehicle.start();
        vehicle.stop();
        vehicle.accelerate();
        vehicle.brake();
        vehicle.honk();

        Vehicle airplane = new Airplane();
        airplane.start();
        airplane.stop();
        airplane.accelerate();
        airplane.brake();
        airplane.honk();

        Bicycle bicycle = new Bicycle();
        bicycle.start();
        bicycle.stop();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.honk();

        Boat boat = new Boat();
        boat.start();
        boat.stop();
        boat.accelerate();
        boat.brake();
        boat.honk();

        Vehicle bus = new Bus();
        bus.start();
        bus.stop();
        bus.accelerate();
        bus.brake();
        bus.honk();

        Car car = new Car();
        car.start();
        car.stop();
        car.accelerate();
        car.brake();
        car.honk();

        Helicopter helicopter = new Helicopter();
        helicopter.start();
        helicopter.stop();
        helicopter.accelerate();
        helicopter.brake();
        helicopter.honk();

        Vehicle motorcycle = new Motorcycle();
        motorcycle.start();
        motorcycle.stop();
        motorcycle.accelerate();
        motorcycle.brake();
        motorcycle.honk();

        Scooter scooter = new Scooter();
        scooter.start();
        scooter.stop();
        scooter.accelerate();
        scooter.brake();
        scooter.honk();

        Submarine submarine = new Submarine();
        submarine.start();
        submarine.stop();
        submarine.accelerate();
        submarine.brake();
        submarine.honk();

        Train train = new Train();
        train.start();
        train.stop();
        train.accelerate();
        train.brake();
        train.honk();

        Vehicle truck = new Truck();
        truck.start();
        truck.stop();
        truck.accelerate();
        truck.brake();
        truck.honk();

        System.out.println("\n===== ANIMAL HIERARCHY =====");
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        animal.move();
        animal.breathe();
        animal.makeSound();

        Animal bear = new Bear();
        bear.eat();
        bear.sleep();
        bear.move();
        bear.breathe();
        bear.makeSound();

        Bird bird = new Bird();
        bird.eat();
        bird.sleep();
        bird.move();
        bird.breathe();
        bird.makeSound();

        Cat cat = new Cat();
        cat.eat();
        cat.sleep();
        cat.move();
        cat.breathe();
        cat.makeSound();

        Animal dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.move();
        dog.breathe();
        dog.makeSound();

        Animal dolphin = new Dolphin();
        dolphin.eat();
        dolphin.sleep();
        dolphin.move();
        dolphin.breathe();
        dolphin.makeSound();

        Elephant elephant = new Elephant();
        elephant.eat();
        elephant.sleep();
        elephant.move();
        elephant.breathe();
        elephant.makeSound();

        Fish fish = new Fish();
        fish.eat();
        fish.sleep();
        fish.move();
        fish.breathe();
        fish.makeSound();

        Giraffe giraffe = new Giraffe();
        giraffe.eat();
        giraffe.sleep();
        giraffe.move();
        giraffe.breathe();
        giraffe.makeSound();

        Kangaroo kangaroo = new Kangaroo();
        kangaroo.eat();
        kangaroo.sleep();
        kangaroo.move();
        kangaroo.breathe();
        kangaroo.makeSound();

        Lion lion = new Lion();
        lion.eat();
        lion.sleep();
        lion.move();
        lion.breathe();
        lion.makeSound();

        Animal monkey = new Monkey();
        monkey.eat();
        monkey.sleep();
        monkey.move();
        monkey.breathe();
        monkey.makeSound();

        Penguin penguin = new Penguin();
        penguin.eat();
        penguin.sleep();
        penguin.move();
        penguin.breathe();
        penguin.makeSound();

        Snake snake = new Snake();
        snake.eat();
        snake.sleep();
        snake.move();
        snake.breathe();
        snake.makeSound();

        Wolf wolf = new Wolf();
        wolf.eat();
        wolf.sleep();
        wolf.move();
        wolf.breathe();
        wolf.makeSound();

        System.out.println("\n===== ELECTRONIC DEVICE HIERARCHY =====");

        ElectronicDevice device = new ElectronicDevice();
        device.powerOn();
        device.powerOff();
        device.charge();
        device.updateSoftware();
        device.connectWifi();

        ElectronicDevice camera = new Camera();
        camera.powerOn();
        camera.powerOff();
        camera.charge();
        camera.updateSoftware();
        camera.connectWifi();

        GameConsole gameConsole = new GameConsole();
        gameConsole.powerOn();
        gameConsole.powerOff();
        gameConsole.charge();
        gameConsole.updateSoftware();
        gameConsole.connectWifi();

        ElectronicDevice laptop = new Laptop();
        laptop.powerOn();
        laptop.powerOff();
        laptop.charge();
        laptop.updateSoftware();
        laptop.connectWifi();

        Router router = new Router();
        router.powerOn();
        router.powerOff();
        router.charge();
        router.updateSoftware();
        router.connectWifi();

        ElectronicDevice smartphone = new Smartphone();
        smartphone.powerOn();
        smartphone.powerOff();
        smartphone.charge();
        smartphone.updateSoftware();
        smartphone.connectWifi();

        SmartSpeaker smartSpeaker = new SmartSpeaker();
        smartSpeaker.powerOn();
        smartSpeaker.powerOff();
        smartSpeaker.charge();
        smartSpeaker.updateSoftware();
        smartSpeaker.connectWifi();

        ElectronicDevice smartWatch = new SmartWatch();
        smartWatch.powerOn();
        smartWatch.powerOff();
        smartWatch.charge();
        smartWatch.updateSoftware();
        smartWatch.connectWifi();

        Tablet tablet = new Tablet();
        tablet.powerOn();
        tablet.powerOff();
        tablet.charge();
        tablet.updateSoftware();
        tablet.connectWifi();

        ElectronicDevice tv = new TV();
        tv.powerOn();
        tv.powerOff();
        tv.charge();
        tv.updateSoftware();
        tv.connectWifi();


        System.out.println("\n===== FURNITURE HIERARCHY =====");

        Furniture furniture = new Furniture();
        furniture.assemble();
        furniture.disassemble();
        furniture.clean();
        furniture.move();
        furniture.repair();

        Bed bed = new Bed();
        bed.assemble();
        bed.disassemble();
        bed.clean();
        bed.move();
        bed.repair();

        Furniture bookshelf = new Bookshelf();
        bookshelf.assemble();
        bookshelf.disassemble();
        bookshelf.clean();
        bookshelf.move();
        bookshelf.repair();

        Cabinet cabinet = new Cabinet();
        cabinet.assemble();
        cabinet.disassemble();
        cabinet.clean();
        cabinet.move();
        cabinet.repair();

        Furniture chair = new Chair();
        chair.assemble();
        chair.disassemble();
        chair.clean();
        chair.move();
        chair.repair();

        CoffeeTable coffeeTable = new CoffeeTable();
        coffeeTable.assemble();
        coffeeTable.disassemble();
        coffeeTable.clean();
        coffeeTable.move();
        coffeeTable.repair();

        Furniture desk = new Desk();
        desk.assemble();
        desk.disassemble();
        desk.clean();
        desk.move();
        desk.repair();

        Dresser dresser = new Dresser();
        dresser.assemble();
        dresser.disassemble();
        dresser.clean();
        dresser.move();
        dresser.repair();

        Furniture nightstand = new Nightstand();
        nightstand.assemble();
        nightstand.disassemble();
        nightstand.clean();
        nightstand.move();
        nightstand.repair();

        Sofa sofa = new Sofa();
        sofa.assemble();
        sofa.disassemble();
        sofa.clean();
        sofa.move();
        sofa.repair();

        Furniture table = new Table();
        table.assemble();
        table.disassemble();
        table.clean();
        table.move();
        table.repair();

        Wardrobe wardrobe = new Wardrobe();
        wardrobe.assemble();
        wardrobe.disassemble();
        wardrobe.clean();
        wardrobe.move();
        wardrobe.repair();

        System.out.println("\n===== APPLIANCE HIERARCHY =====");

        Appliance appliance = new Appliance();
        appliance.plugIn();
        appliance.turnOn();
        appliance.turnOff();
        appliance.clean();
        appliance.repair();

        Appliance airFryer = new AirFryer();
        airFryer.plugIn();
        airFryer.turnOn();
        airFryer.turnOff();
        airFryer.clean();
        airFryer.repair();

        Blender blender = new Blender();
        blender.plugIn();
        blender.turnOn();
        blender.turnOff();
        blender.clean();
        blender.repair();

        Appliance coffeeMaker = new CoffeeMaker();
        coffeeMaker.plugIn();
        coffeeMaker.turnOn();
        coffeeMaker.turnOff();
        coffeeMaker.clean();
        coffeeMaker.repair();

        Dishwasher dishwasher = new Dishwasher();
        dishwasher.plugIn();
        dishwasher.turnOn();
        dishwasher.turnOff();
        dishwasher.clean();
        dishwasher.repair();

        Appliance microwave = new Microwave();
        microwave.plugIn();
        microwave.turnOn();
        microwave.turnOff();
        microwave.clean();
        microwave.repair();

        Oven oven = new Oven();
        oven.plugIn();
        oven.turnOn();
        oven.turnOff();
        oven.clean();
        oven.repair();

        Appliance refrigerator = new Refrigerator();
        refrigerator.plugIn();
        refrigerator.turnOn();
        refrigerator.turnOff();
        refrigerator.clean();
        refrigerator.repair();

        Toaster toaster = new Toaster();
        toaster.plugIn();
        toaster.turnOn();
        toaster.turnOff();
        toaster.clean();
        toaster.repair();

        Appliance vacuumCleaner = new VacuumCleaner();
        vacuumCleaner.plugIn();
        vacuumCleaner.turnOn();
        vacuumCleaner.turnOff();
        vacuumCleaner.clean();
        vacuumCleaner.repair();

        WashingMachine washingMachine = new WashingMachine();
        washingMachine.plugIn();
        washingMachine.turnOn();
        washingMachine.turnOff();
        washingMachine.clean();
        washingMachine.repair();

        System.out.println("\n===== CLOTHING HIERARCHY =====");

        Clothing clothing = new Clothing();
        clothing.wear();
        clothing.wash();
        clothing.dry();
        clothing.iron();
        clothing.fold();

        Clothing dress = new Dress();
        dress.wear();
        dress.wash();
        dress.dry();
        dress.iron();
        dress.fold();

        Hat hat = new Hat();
        hat.wear();
        hat.wash();
        hat.dry();
        hat.iron();
        hat.fold();

        Clothing jacket = new Jacket();
        jacket.wear();
        jacket.wash();
        jacket.dry();
        jacket.iron();
        jacket.fold();

        Jeans jeans = new Jeans();
        jeans.wear();
        jeans.wash();
        jeans.dry();
        jeans.iron();
        jeans.fold();

        Clothing shirt = new Shirt();
        shirt.wear();
        shirt.wash();
        shirt.dry();
        shirt.iron();
        shirt.fold();

        Shorts shorts = new Shorts();
        shorts.wear();
        shorts.wash();
        shorts.dry();
        shorts.iron();
        shorts.fold();

        Clothing skirt = new Skirt();
        skirt.wear();
        skirt.wash();
        skirt.dry();
        skirt.iron();
        skirt.fold();

        Socks socks = new Socks();
        socks.wear();
        socks.wash();
        socks.dry();
        socks.iron();
        socks.fold();

        Clothing sweater = new Sweater();
        sweater.wear();
        sweater.wash();
        sweater.dry();
        sweater.iron();
        sweater.fold();

        Underwear underwear = new Underwear();
        underwear.wear();
        underwear.wash();
        underwear.dry();
        underwear.iron();
        underwear.fold();


        System.out.println("\n===== PLANT HIERARCHY =====");

        Plant plant = new Plant();
        plant.water();
        plant.grow();
        plant.prune();
        plant.fertilize();
        plant.harvest();

        Aloe aloe = new Aloe();
        aloe.water();
        aloe.grow();
        aloe.prune();
        aloe.fertilize();
        aloe.harvest();

        Plant bamboo = new Bamboo();
        bamboo.water();
        bamboo.grow();
        bamboo.prune();
        bamboo.fertilize();
        bamboo.harvest();

        Cactus cactus = new Cactus();
        cactus.water();
        cactus.grow();
        cactus.prune();
        cactus.fertilize();
        cactus.harvest();

        Fern fern = new Fern();
        fern.water();
        fern.grow();
        fern.prune();
        fern.fertilize();
        fern.harvest();

        Plant maple = new Maple();
        maple.water();
        maple.grow();
        maple.prune();
        maple.fertilize();
        maple.harvest();

        Oak oak = new Oak();
        oak.water();
        oak.grow();
        oak.prune();
        oak.fertilize();
        oak.harvest();

        Plant pine = new Pine();
        pine.water();
        pine.grow();
        pine.prune();
        pine.fertilize();
        pine.harvest();

        Rose rose = new Rose();
        rose.water();
        rose.grow();
        rose.prune();
        rose.fertilize();
        rose.harvest();

        Plant sunflower = new Sunflower();
        sunflower.water();
        sunflower.grow();
        sunflower.prune();
        sunflower.fertilize();
        sunflower.harvest();

        Tulip tulip = new Tulip();
        tulip.water();
        tulip.grow();
        tulip.prune();
        tulip.fertilize();
        tulip.harvest();

        System.out.println("\n===== TOOL HIERARCHY =====");

        Tool tool = new Tool();
        tool.grip();
        tool.use();
        tool.sharpen();
        tool.clean();
        tool.store();

        Axe axe = new Axe();
        axe.grip();
        axe.use();
        axe.sharpen();
        axe.clean();
        axe.store();

        Tool chisel = new Chisel();
        chisel.grip();
        chisel.use();
        chisel.sharpen();
        chisel.clean();
        chisel.store();

        Drill drill = new Drill();
        drill.grip();
        drill.use();
        drill.sharpen();
        drill.clean();
        drill.store();

        Tool hammer = new Hammer();
        hammer.grip();
        hammer.use();
        hammer.sharpen();
        hammer.clean();
        hammer.store();

        Pliers pliers = new Pliers();
        pliers.grip();
        pliers.use();
        pliers.sharpen();
        pliers.clean();
        pliers.store();

        Tool rake = new Rake();
        rake.grip();
        rake.use();
        rake.sharpen();
        rake.clean();
        rake.store();

        Saw saw = new Saw();
        saw.grip();
        saw.use();
        saw.sharpen();
        saw.clean();
        saw.store();

        Tool screwdriver = new Screwdriver();
        screwdriver.grip();
        screwdriver.use();
        screwdriver.sharpen();
        screwdriver.clean();
        screwdriver.store();

        Shovel shovel = new Shovel();
        shovel.grip();
        shovel.use();
        shovel.sharpen();
        shovel.clean();
        shovel.store();

        Tool wrench = new Wrench();
        wrench.grip();
        wrench.use();
        wrench.sharpen();
        wrench.clean();
        wrench.store();

        System.out.println("\n===== MUSICAL INSTRUMENT HIERARCHY =====");

        MusicalInstrument instrument = new MusicalInstrument();
        instrument.tune();
        instrument.play();
        instrument.clean();
        instrument.store();
        instrument.repair();

        Cello cello = new Cello();
        cello.tune();
        cello.play();
        cello.clean();
        cello.store();
        cello.repair();

        MusicalInstrument clarinet = new Clarinet();
        clarinet.tune();
        clarinet.play();
        clarinet.clean();
        clarinet.store();
        clarinet.repair();

        Drums drums = new Drums();
        drums.tune();
        drums.play();
        drums.clean();
        drums.store();
        drums.repair();

        MusicalInstrument flute = new Flute();
        flute.tune();
        flute.play();
        flute.clean();
        flute.store();
        flute.repair();

        Guitar guitar = new Guitar();
        guitar.tune();
        guitar.play();
        guitar.clean();
        guitar.store();
        guitar.repair();

        MusicalInstrument harp = new Harp();
        harp.tune();
        harp.play();
        harp.clean();
        harp.store();
        harp.repair();

        Piano piano = new Piano();
        piano.tune();
        piano.play();
        piano.clean();
        piano.store();
        piano.repair();

        MusicalInstrument saxophone = new Saxophone();
        saxophone.tune();
        saxophone.play();
        saxophone.clean();
        saxophone.store();
        saxophone.repair();

        Trombone trombone = new Trombone();
        trombone.tune();
        trombone.play();
        trombone.clean();
        trombone.store();
        trombone.repair();

        MusicalInstrument trumpet = new Trumpet();
        trumpet.tune();
        trumpet.play();
        trumpet.clean();
        trumpet.store();
        trumpet.repair();

        Violin violin = new Violin();
        violin.tune();
        violin.play();
        violin.clean();
        violin.store();
        violin.repair();

        System.out.println("====================================================================");
        GrizzlyBear grizzly = new GrizzlyBear();

        grizzly.invokeAllBearMethods();

        grizzly.checkAndCast(grizzly);

        Bear normalBear = new Bear();
        grizzly.checkAndCast(normalBear);

        System.out.println("====================================================================");
        StreetDog streetDog = new StreetDog();
        streetDog.invokeAllDogMethods();

        streetDog.checkAndCast(streetDog);

        Dog normalDog = new Dog();
        streetDog.checkAndCast(normalDog);
    }
}