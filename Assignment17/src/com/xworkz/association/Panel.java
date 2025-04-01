package com.xworkz.association;

class Panel {
    private String displayType;
    private boolean isOn;
    private Manufacturer manufacturer;

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    void display() {
        System.out.println(displayType + " panel by " + manufacturer.getName() + " is " + (isOn ? "on" : "off"));
    }
}
