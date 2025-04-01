package com.xworkz.association;

class Port {
    private String type;
    private boolean isConnected;
    private Manufacturer manufacturer;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isConnected() {
        return isConnected;
    }

    public void setConnected(boolean connected) {
        isConnected = connected;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    void connect() {
        System.out.println(type + " port by " + manufacturer.getName() + " is " + (isConnected ? "connected" : "disconnected"));
    }
}
