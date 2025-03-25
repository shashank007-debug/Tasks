package com.xworkz.accessorsAndMutators;

public class AlienService {
    public void processAliens(Alien[] aliens) {
        System.out.println("Processing multiple Aliens...");
        for (Alien alien : aliens) {
            if (alien != null) {
                System.out.println("Seen By: " + alien.getSeenBy());
                System.out.println("Seen Date: " + alien.getSeenDate());
                System.out.println("Description: " + alien.getDescribe());
                System.out.println("==============================================");
            }
        }
    }

    public void initAliensLocally() {
        Alien[] aliens = new Alien[2];

        aliens[0] = new Alien();
        aliens[0].setSeenBy("Ravi");
        aliens[0].setSeenDate("2025-03-10");
        aliens[0].setDescribe("Tall with glowing green eyes and smooth skin");

        aliens[1] = new Alien();
        aliens[1].setSeenBy("Priya");
        aliens[1].setSeenDate("2025-03-15");
        aliens[1].setDescribe("Short with blue skin and a large head");

        processAliens(aliens);
    }
}
