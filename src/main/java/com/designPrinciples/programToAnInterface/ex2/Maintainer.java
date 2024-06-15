package com.designPrinciples.programToAnInterface.ex2;

public class Maintainer implements Employee {

    @Override
    public void perform() {
        maintain();
    }

    private void maintain() {
        System.out.println("Maintaining the software...");
    }
}
