package com.xworkz.inheritance.internal.appliance;

public class RobotVacuum extends VacuumCleaner {
    public void startAutoCleaning() {
        System.out.println("RobotVacuum started automatic cleaning");
    }

    public void invokeAllInheritedMethods() {
        plugIn();
        turnOn();
        clean();
        repair();
        turnOff();
    }

    public void checkAndCast(VacuumCleaner vacuumCleaner) {
        if (vacuumCleaner instanceof RobotVacuum) {
            RobotVacuum robot = (RobotVacuum) vacuumCleaner;
            robot.startAutoCleaning();
        } else {
            System.out.println("Not a RobotVacuum");
        }
    }
}
