package com.solid.lsp.check3;

public class Employee {

    public void perform(int tasks) throws IllegalArgumentException {
        if (tasks < 0) throw new IllegalArgumentException();
    }
}
