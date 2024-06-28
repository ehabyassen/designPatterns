package com.designPatterns.structural.flyweight.example1;

public abstract class Player {

    private String weapon;

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    protected abstract String getMission();

    public void render() {
        System.out.println(getMission() + ", " + getWeapon());
    }
}
