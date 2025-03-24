package com.xworkz.country;

public class Experience {
    int totalYears;
    String domain;
    boolean isRelevant;
    ExperienceDetail exp1 = new ExperienceDetail("Developer", 2, 45000, new Company("TCS", "Bangalore", 5000, true));
    ExperienceDetail exp2 = new ExperienceDetail("Tester", 1, 30000, new Company("Wipro", "Chennai", 4000, true));
    ExperienceDetail exp3 = new ExperienceDetail("Intern", 1, 15000, new Company("Infosys", "Mysore", 3000, true));
    ExperienceDetail exp4 = new ExperienceDetail("Support", 1, 20000, new Company("Accenture", "Hyderabad", 3500, true));
    ExperienceDetail exp5 = new ExperienceDetail("Lead", 3, 70000, new Company("IBM", "Pune", 6000, true));
    ExperienceDetail[] experienceDetails = {exp1, exp2, exp3, exp4, exp5};

    Experience(int totalYears, String domain, boolean isRelevant) {
        this.totalYears = totalYears;
        this.domain = domain;
        this.isRelevant = isRelevant;
    }

    void display() {
        System.out.println("Total Years of Experience: " + this.totalYears);
        System.out.println("Domain: " + this.domain);
        System.out.println("Is Relevant: " + this.isRelevant);
        System.out.println("=====================================================================================");
        for (ExperienceDetail detail : experienceDetails) {
            detail.display();
            System.out.println("=====================================================================================");
        }
    }
}
