package com.xworkz.inheritance.runner;
import com.xworkz.inheritance.internal1.*;
import com.xworkz.inheritance.internal.*;
import com.xworkz.inheritance.internal2.*;
import com.xworkz.inheritance.internal.Manager;

public class Runner {
    public static void main(String[] args) {
        System.out.println("=== Single Level Inheritance ===");
        System.out.println("\n1. Vehicle and Car:");
        Car myCar = new Car();
        myCar.startEngine();
        myCar.drive();

        System.out.println("\n2. Animal and Dog:");
        Dog myDog = new Dog();
        myDog.eat();
        myDog.barking();

        System.out.println("\n3. ElectronicDevice and Smartphone:");
        Smartphone myPhone = new Smartphone();
        myPhone.powerOn();
        myPhone.makeCall();

        System.out.println("\n4. Shape and Circle:");
        Circle myCircle = new Circle();
        myCircle.draw();

        System.out.println("\n5. Employee and Manager:");
        Manager teamLead = new Manager();
        teamLead.work();
        teamLead.manageTeam();

        System.out.println("\n6. BankAccount and SavingsAccount:");
        SavingsAccount mySavings = new SavingsAccount();
        mySavings.deposit();
        mySavings.addInterest();

        System.out.println("\n7. Furniture and Chair:");
        Chair myChair = new Chair();
        myChair.assemble();
        myChair.sit();

        System.out.println("\n8. Plant and Tree:");
        Tree oakTree = new Tree();
        oakTree.grow();
        oakTree.produceOxygen();

        System.out.println("\n9. Clothing and Shirt:");
        Shirt myShirt = new Shirt();
        myShirt.wear();
        myShirt.buttonUp();

        System.out.println("\n10. MusicalInstrument and Guitar:");
        Guitar myGuitar = new Guitar();
        myGuitar.play();
        myGuitar.strum();

        System.out.println("\n11. Document and PDFDocument:");
        PDFDocument myPDF = new PDFDocument();
        myPDF.open();
        myPDF.viewPages();
        System.out.println("\n=== Single inheritance ===");

        System.out.println("=== Multi-Level Inheritance  ===");

        System.out.println("\n Vehicle → Car → ElectricCar:");
        ElectricCar tesla = new ElectricCar();
        tesla.startEngine();
        tesla.drive();
        tesla.charge();

        System.out.println("\n Animal → Dog → Puppy:");
        Puppy goldenRetriever = new Puppy();
        goldenRetriever.eat();
        goldenRetriever.barking();
        goldenRetriever.bark();

        System.out.println("\n Shape → Polygon → Rectangle:");
        Rectangle rect = new Rectangle();
        rect.draw();
        rect.countSide();
        rect.calculateArea();

        System.out.println("\n  Computer → Laptop → Tablet:");
        Tablet ipad = new Tablet();
        ipad.powerOn();
        ipad.makeCall();
        ipad.fold();

        System.out.println("\n===  Multi-level inheritance ===");

        System.out.println("=== Hierarchical ===");
        System.out.println("\n1. Credit Card Payment:");
        CreditCard visa = new CreditCard();
        visa.processPayment();
        visa.verifyCard();
        visa.cancelPayment();

        System.out.println("\n2. PayPal Payment:");
        PayPal paypal = new PayPal();
        paypal.processPayment();
        paypal.authorizePayPal();
        paypal.checkBalance();

        System.out.println("\n3. Bank Transfer:");
        BankTransfer wireTransfer = new BankTransfer();
        wireTransfer.processPayment();
        wireTransfer.validateAccount();
        wireTransfer.processRoutingNumber();

        System.out.println("\n4. Cryptocurrency Payment:");
        CryptoPayment bitcoin = new CryptoPayment();
        bitcoin.processPayment();
        bitcoin.verifyWallet();
        bitcoin.convertToFiat();

        System.out.println("\n5. Mobile Payment:");
        MobilePayment applePay = new MobilePayment();
        applePay.processPayment();
        applePay.authenticateDevice();
        applePay.processToken();

        System.out.println("\n6. Gift Card Payment:");
        GiftCard amazonGiftCard = new GiftCard();
        amazonGiftCard.processPayment();
        amazonGiftCard.checkBalance();
        amazonGiftCard.applyDiscount();

        System.out.println("\n7. Installment Payment:");
        InstallmentPayment monthlyInstallment = new InstallmentPayment();
        monthlyInstallment.processPayment();
        monthlyInstallment.calculateInstallments();
        monthlyInstallment.schedulePayments();

        System.out.println("\n8. Loyalty Points Payment:");
        LoyaltyPoints rewardsPoints = new LoyaltyPoints();
        rewardsPoints.processPayment();
        rewardsPoints.checkPointsBalance();
        rewardsPoints.convertPoints();

        System.out.println("\n9. Direct Debit Payment:");
        DirectDebit autoDebit = new DirectDebit();
        autoDebit.processPayment();
        autoDebit.verifyBankDetails();
        autoDebit.setupMandate();

        System.out.println("\n10. Buy Now Pay Later:");
        BNPL klarna = new BNPL();
        klarna.processPayment();
        klarna.creditCheck();
        klarna.scheduleFuturePayment();

        System.out.println("\n11. Cash on Delivery:");
        CashOnDelivery cod = new CashOnDelivery();
        cod.processPayment();
        cod.generateDeliveryNote();
        cod.confirmReceipt();

        System.out.println("\n=== Hierarchical ===");

        System.out.println("===== HYBRID INHERITANCE  =====");

        System.out.println("\n Media → Video → Movie + Media → Audio → Song");
        Movie avengers = new Movie();
        avengers.play();
        avengers.adjustResolution();
        avengers.showSubtitles();

        Song thriller = new Song();
        thriller.play();
        thriller.adjustVolume();
        thriller.displayLyrics();

        System.out.println("\n Employee → Developer → WebDeveloper + Employee → Manager");
        WebDeveloper frontendDev = new WebDeveloper();
        frontendDev.work();
        frontendDev.code();
        frontendDev.buildWebsite();

        Manager projectManager = new Manager();
        projectManager.work();
        System.out.println("===== HYBRID INHERITANCE =====");
    }
}
