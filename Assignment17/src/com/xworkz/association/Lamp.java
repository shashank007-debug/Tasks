package com.xworkz.association;

class Lamp {
    private String brand;
    private int brightness;
    private Manufacturer manufacturer;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    void light() {
        System.out.println(brand + " lamp by " + manufacturer.getName() + " is lighting at " + brightness + " lumens");
    }
}
