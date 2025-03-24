package com.xworkz.country;

public class Personnel {
    String name;
    int age;
    String role;
    boolean isTrained;

    Skill skill1 = new Skill("Java", 9, true, new Experience(3, "Backend", true));
    Skill skill2 = new Skill("SQL", 8, false, new Experience(2, "Database", true));
    Skill skill3 = new Skill("React", 7, true, new Experience(2, "Frontend", true));
    Skill skill4 = new Skill("Spring", 6, false, new Experience(1, "Framework", true));
    Skill skill5 = new Skill("HTML", 10, true, new Experience(4, "UI", true));
    Skill[] skills = {skill1, skill2, skill3, skill4, skill5};

    Personnel(String name, int age, String role, boolean isTrained) {
        this.name = name;
        this.age = age;
        this.role = role;
        this.isTrained = isTrained;
    }

    void display() {
        System.out.println("Personnel Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Role: " + this.role);
        System.out.println("Is Trained: " + this.isTrained);
        System.out.println("=====================================================================================");
        for (Skill skill : skills) {
            skill.display();
            System.out.println("=====================================================================================");
        }
    }
}
