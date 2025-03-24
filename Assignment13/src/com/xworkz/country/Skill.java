package com.xworkz.country;

public class Skill {
    String name;
    int proficiency;
    boolean isCertified;
    Experience experience;

    Skill(String name, int proficiency, boolean isCertified, Experience experience) {
        this.name = name;
        this.proficiency = proficiency;
        this.isCertified = isCertified;
        this.experience = experience;
    }

    void display() {
        System.out.println("Skill Name: " + this.name);
        System.out.println("Proficiency: " + this.proficiency);
        System.out.println("Certified: " + this.isCertified);
        System.out.println("=====================================================================================");
        if (experience != null) {
            experience.display();
            System.out.println("=====================================================================================");
        }
    }
}