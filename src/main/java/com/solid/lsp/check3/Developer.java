package com.solid.lsp.check3;

public class Developer extends Employee {

    @Override
    public void perform(int tasks) throws IllegalArgumentException {
        if (tasks < 0) throw new IllegalArgumentException();
        System.out.println("Writing Code...");
    }
}
