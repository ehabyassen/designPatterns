package com.designPatterns.structural.flyweight.example1;

import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {

    private final Map<String, Player> players = new HashMap<>();

    public Player getPlayer(String type) {
        if (players.containsKey(type)) {
            return players.get(type);
        }
        else {
            if (type.equals("RedTeam")) {
                RedTeamPlayer player = new RedTeamPlayer();
                players.put("RedTeam", player);
                return player;
            } else if (type.equals("BlueTeam")) {
                BlueTeamPlayer player = new BlueTeamPlayer();
                players.put("BlueTeam", player);
                return player;
            } else {
                System.out.println("Team not found...");
               throw new IllegalArgumentException();
            }
        }
    }
}
