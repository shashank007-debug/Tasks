package com.xworkz.accessorsAndMutators;

public class IdCardService {
    public void processIdCards(IdCard[] idCards) {
        System.out.println("Processing multiple ID Cards...");
        for (IdCard card : idCards) {
            if (card != null) {
                System.out.println("Material: " + card.getMaterial());
                System.out.println("Colors: " + String.join(", ", card.getColors()));
                System.out.println("Weight: " + card.getWeight() + " grams");
                System.out.println("Designed By: " + card.getDesignedBy());
                System.out.println("==============================================");
            }
        }
    }
    public void initIdCardsLocally() {
        IdCard[] idCards = new IdCard[3];

        idCards[0] = new IdCard();
        idCards[0].setMaterial("PVC");
        idCards[0].setColors(new String[]{"Blue", "White"});
        idCards[0].setWeight(15.2);
        idCards[0].setDesignedBy("Sahil Tahar");

        idCards[1] = new IdCard();
        idCards[1].setMaterial("Plastic");
        idCards[1].setColors(new String[]{"Red", "Black"});
        idCards[1].setWeight(18.5);
        idCards[1].setDesignedBy("John Doe");

        idCards[2] = new IdCard();
        idCards[2].setMaterial("Metal");
        idCards[2].setColors(new String[]{"Silver", "Gold"});
        idCards[2].setWeight(25.0);
        idCards[2].setDesignedBy("Alice Smith");

        processIdCards(idCards);
    }
}
