package com.designPatterns.behavioral.memento;

import java.util.Stack;

public class CareTaker {

    private final Stack<SnapShot> snapShots = new Stack<>();

    public void save(Game game) {
        SnapShot snapShot = game.save();
        snapShots.push(snapShot);
        System.out.println("Saved SnapShot: " + snapShot);
    }

    public void revert(Game game) {
        SnapShot snapShot = snapShots.pop();
        game.revert(snapShot);
        System.out.println("Reverted to SnapShot: " + snapShot);
    }
}
