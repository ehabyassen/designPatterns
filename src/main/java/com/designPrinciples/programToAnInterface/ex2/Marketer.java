package com.designPrinciples.programToAnInterface.ex2;

public class Marketer implements Employee {

    @Override
    public void perform() {
        market();
    }

    private void market() {
        System.out.println("Marketing the software...");
    }
}
