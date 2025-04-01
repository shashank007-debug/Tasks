package com.xworkz.association;

class Len {
    private String type;
    private int zoomLevel;
    private Manufacturer manufacturer;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getZoomLevel() {
        return zoomLevel;
    }

    public void setZoomLevel(int zoomLevel) {
        this.zoomLevel = zoomLevel;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    void zoom() {
        System.out.println("Len (" + type + ") from " + manufacturer.getName() + " is zooming to level " + zoomLevel);
    }
}