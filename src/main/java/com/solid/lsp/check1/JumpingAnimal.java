package com.solid.lsp.check1;

public class JumpingAnimal extends Animal {

    public JumpingAnimal(String name) {
        super(name);
    }

    public void jump() {
        System.out.println(getName() + " is jumping...");
    }
}
