package com.oopEssentials.inheritance;

public abstract class UiComponent {

    public void enable() {
        System.out.println("enabled");
    }

    abstract void disable();
}
