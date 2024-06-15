package com.designPrinciples.compositionOverInheritance.solution;

public class Main {

    public static void main(String[] args) {
        Transport transport = new Transport(new Human(), new ElectricEngine());
        transport.deliver("Cairo", "Milk");
    }
}
