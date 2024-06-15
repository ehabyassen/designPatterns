package com.oopEssentials.polymorphism;

public class Main {

    public static void main(String[] args) {
        drawUiComponent(new CheckBox());
    }

    private static void drawUiComponent(UiComponent component) {
        component.draw();
    }
}
