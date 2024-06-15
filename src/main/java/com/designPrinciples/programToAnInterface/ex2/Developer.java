package com.designPrinciples.programToAnInterface.ex2;

public class Developer implements Employee {

    @Override
    public void perform() {
        develop();
    }

    private void develop() {
        System.out.println("Developing the software...");
    }
}
