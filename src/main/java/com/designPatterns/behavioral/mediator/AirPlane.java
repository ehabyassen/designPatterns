package com.designPatterns.behavioral.mediator;

public class AirPlane extends AirCraft {

    public AirPlane(String name, AirPortTower airPortTower) {
        super(name, airPortTower);
    }


    void notify(String message) {
        System.out.println("Notifying " + getName() + " with message: " + message);
    }

    void requestLanding() {
        airPortTower.requestLanding(this);
    }

    void notifySuccess() {
        setLanded(true);
        airPortTower.notifySuccess(getName());
    }
}
