package com.xworkz.association;

class Remote {
    private String brand;
    private int batteries;
    private Manufacturer manufacturer;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getBatteries() {
        return batteries;
    }

    public void setBatteries(int batteries) {
        this.batteries = batteries;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    void operate() {
        System.out.println(brand + " remote by " + manufacturer.getName() + " is operating with " + batteries + " batteries");
    }
}
