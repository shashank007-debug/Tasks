package com.xworkz.association;

class Wire {
    private String material;
    private double length;
    private Manufacturer manufacturer;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    void transmit() {
        System.out.println(material + " wire (" + length + "m) by " + manufacturer.getName() + " is transmitting");
    }
}