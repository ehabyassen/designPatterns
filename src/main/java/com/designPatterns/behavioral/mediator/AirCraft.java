package com.designPatterns.behavioral.mediator;

public abstract class AirCraft {

    private final String name;
    protected final AirPortTower airPortTower;
    private boolean landed;

    public AirCraft(String name, AirPortTower airPortTower) {
        this.name = name;
        this.airPortTower = airPortTower;
        airPortTower.register(this);
    }

    abstract void notify(String message);

    abstract void requestLanding();

    abstract void notifySuccess();

    public String getName() {
        return name;
    }

    public boolean isLanded() {
        return landed;
    }

    public void setLanded(boolean landed) {
        this.landed = landed;
    }

    @Override
    public String toString() {
        return "AirCraft{" +
                "name='" + name + '\'' +
                '}';
    }
}
