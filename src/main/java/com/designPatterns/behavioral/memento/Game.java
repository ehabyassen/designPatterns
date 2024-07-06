package com.designPatterns.behavioral.memento;

public class Game {

    private String playerName;

    private int playerScore;

    public Game(String playerName, int playerScore) {
        this.playerName = playerName;
        this.playerScore = playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public SnapShot save() {
        return new SnapShot(playerName, playerScore);
    }

    public void revert(SnapShot snapShot) {
        playerName = snapShot.getPlayerName();
        playerScore = snapShot.getPlayerScore();
    }

    @Override
    public String toString() {
        return "Game{" +
                "playerName='" + playerName + '\'' +
                ", playerScore=" + playerScore +
                '}';
    }
}
