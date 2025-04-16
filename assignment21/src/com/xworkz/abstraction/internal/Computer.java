package com.xworkz.abstraction.internal;

abstract class Computer {
    protected String cpu;
    protected int ram;
    protected int storage;
    protected String manufacturer;

    public Computer(String cpu, int ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    public Computer(String cpu, int ram, int storage) {
        this(cpu, ram);
        this.storage = storage;
    }

    public Computer(String cpu, int ram, int storage, String manufacturer) {
        this(cpu, ram, storage);
        this.manufacturer = manufacturer;
    }
}
