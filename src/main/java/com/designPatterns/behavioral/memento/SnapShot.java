package com.designPatterns.behavioral.memento;

public class SnapShot {

    private final String playerName;
    private final int playerScore;

    public SnapShot(String playerName, int playerScore) {
        this.playerName = playerName;
        this.playerScore = playerScore;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    @Override
    public String toString() {
        return "SnapShot{" +
                "playerName='" + playerName + '\'' +
                ", playerScore=" + playerScore +
                '}';
    }
}
