package com.xworkz.accessorsAndMutators;

public class CameraServices {
    public void processCamera(Camera camera) {
        System.out.println("Processing Camera...");
        System.out.println("Brand: " + camera.getBrand());
        System.out.println("Price: $" + camera.getPrice());
        System.out.println("Type: " + camera.getType());
        System.out.println("Connectivity: " + camera.getConnectivity());
        System.out.println("==============================================");
    }

    public void initCameraLocally() {
        Camera camera = new Camera();
        camera.setBrand("Canon");
        camera.setPrice(999.99);
        camera.setType(CameraType.DSLR);
        camera.setConnectivity("Wi-Fi");

        processCamera(camera);  // Passing the local object as a parameter
    }
}
