package com.designPrinciples.programToAnInterface.ex2;

public class Tester implements Employee {

    @Override
    public void perform() {
        test();
    }

    private void test() {
        System.out.println("Testing the software...");
    }
}
