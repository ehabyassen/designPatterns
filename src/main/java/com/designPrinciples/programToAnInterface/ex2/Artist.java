package com.designPrinciples.programToAnInterface.ex2;

public class Artist implements Employee {

    @Override
    public void perform() {
        designArtWork();
    }

    private void designArtWork() {
        System.out.println("Designing Art Work...");
    }

}
