package com.xworkz.association;

class Screw {
    private String size;
    private boolean isTightened;
    private Manufacturer manufacturer;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isTightened() {
        return isTightened;
    }

    public void setTightened(boolean tightened) {
        isTightened = tightened;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    void fix() {
        System.out.println(size + " screw by " + manufacturer.getName() + " is " + (isTightened ? "tightened" : "loose"));
    }
}
