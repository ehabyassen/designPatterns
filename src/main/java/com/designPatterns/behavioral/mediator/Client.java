package com.designPatterns.behavioral.mediator;

public class Client {

    public static void main(String[] args) {
        AirPortTower airPortTower = new ConcreteAirPortTower();

        AirCraft airbus = new AirPlane("AirBus 301", airPortTower);
        AirCraft boeing = new AirPlane("Boeing 508", airPortTower);
        AirCraft f16 = new AirPlane("F16", airPortTower);

        System.out.println("#".repeat(50));

        airbus.requestLanding();
        airbus.notifySuccess();

        System.out.println("#".repeat(50));

        boeing.requestLanding();
        boeing.notifySuccess();

        System.out.println("#".repeat(50));

        f16.requestLanding();
        f16.notifySuccess();
    }
}
