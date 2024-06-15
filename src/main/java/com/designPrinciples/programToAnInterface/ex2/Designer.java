package com.designPrinciples.programToAnInterface.ex2;

public class Designer implements Employee {

    @Override
    public void perform() {
        design();
    }

    private void design() {
        System.out.println("Designing the software...");
    }
}
