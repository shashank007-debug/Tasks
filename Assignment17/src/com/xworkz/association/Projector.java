package com.xworkz.association;

class Projector {
    private Len lens;
    private Lamp lamp;
    private Port port;
    private Wire wire;
    private Board board;
    private Button button;
    private Panel panel;
    private Remote remote;
    private Screw screw;

    public Len getLens() {
        return lens;
    }

    public void setLens(Len lens) {
        this.lens = lens;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void setLamp(Lamp lamp) {
        this.lamp = lamp;
    }

    public Port getPort() {
        return port;
    }

    public void setPort(Port port) {
        this.port = port;
    }

    public Wire getWire() {
        return wire;
    }

    public void setWire(Wire wire) {
        this.wire = wire;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public Panel getPanel() {
        return panel;
    }

    public void setPanel(Panel panel) {
        this.panel = panel;
    }

    public Remote getRemote() {
        return remote;
    }

    public void setRemote(Remote remote) {
        this.remote = remote;
    }

    public Screw getScrew() {
        return screw;
    }

    public void setScrew(Screw screw) {
        this.screw = screw;
    }

    void init() {
        Manufacturer m1 = new Manufacturer();
        m1.setName("Sony");
        m1.setCountry("Japan");

        Manufacturer m2 = new Manufacturer();
        m2.setName("Philips");
        m2.setCountry("Netherlands");

        lens = new Len();
        lens.setType("Zoom Lens");
        lens.setZoomLevel(5);
        lens.setManufacturer(m1);

        lamp = new Lamp();
        lamp.setBrand("UltraBright");
        lamp.setBrightness(2000);
        lamp.setManufacturer(m2);

        port = new Port();
        port.setType("HDMI");
        port.setConnected(true);
        port.setManufacturer(m1);

        wire = new Wire();
        wire.setMaterial("Copper");
        wire.setLength(2.5);
        wire.setManufacturer(m2);

        board = new Board();
        board.setModel("Control V2");
        board.setCircuits(8);
        board.setManufacturer(m1);

        button = new Button();
        button.setColor("Red");
        button.setPressed(false);
        button.setManufacturer(m2);

        panel = new Panel();
        panel.setDisplayType("LCD");
        panel.setOn(true);
        panel.setManufacturer(m1);

        remote = new Remote();
        remote.setBrand("ProRemote");
        remote.setBatteries(2);
        remote.setManufacturer(m2);

        screw = new Screw();
        screw.setSize("M3");
        screw.setTightened(true);
        screw.setManufacturer(m1);
    }

    void run() {
        System.out.println("--- Starting Projector ---");
        lens.zoom();
        lamp.light();
        port.connect();
        wire.transmit();
        board.control();
        button.press();
        panel.display();
        remote.operate();
        screw.fix();
        System.out.println("--- Projector Running ---");
    }
}