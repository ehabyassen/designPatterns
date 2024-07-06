package com.designPatterns.behavioral.memento;

public class Client {

    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();

        Game game = new Game("John", 50);
        careTaker.save(game);

        game.setPlayerScore(100);

        System.out.println(game);
        careTaker.revert(game);
    }
}
