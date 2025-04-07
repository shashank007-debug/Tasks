package com.xworkz.inheritance.internal.appliance;

public class PortableBlender extends Blender {
    public void chargeViaUSB() {
        System.out.println("PortableBlender charging via USB");
    }

    public void invokeAllInheritedMethods() {
        plugIn();
        turnOn();
        clean();
        repair();
        turnOff();
    }

    public void checkAndCast(Blender blender) {
        if (blender instanceof PortableBlender) {
            PortableBlender portable = (PortableBlender) blender;
            portable.chargeViaUSB();
        } else {
            System.out.println("Not a PortableBlender");
        }
    }
}
