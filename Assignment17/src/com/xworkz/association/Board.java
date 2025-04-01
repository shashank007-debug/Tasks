package com.xworkz.association;

class Board {
    private String model;
    private int circuits;
    private Manufacturer manufacturer;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCircuits() {
        return circuits;
    }

    public void setCircuits(int circuits) {
        this.circuits = circuits;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    void control() {
        System.out.println(model + " board by " + manufacturer.getName() + " is controlling " + circuits + " circuits");
    }
}
