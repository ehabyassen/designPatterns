package com.designPatterns.structural.flyweight.example1;

public class Client {

    public static void main(String[] args) {
        PlayerFactory playerFactory = new PlayerFactory();

        Player redTeamPlayer1 = playerFactory.getPlayer("RedTeam");
        redTeamPlayer1.setWeapon("Auzi");
        redTeamPlayer1.render();

        Player blueTeamPlayer1 = playerFactory.getPlayer("BlueTeam");
        blueTeamPlayer1.setWeapon("AK-47");
        blueTeamPlayer1.render();

        Player redTeamPlayer2 = playerFactory.getPlayer("RedTeam");
        redTeamPlayer2.setWeapon("MK-14");
        redTeamPlayer2.render();

        System.out.println(redTeamPlayer1.equals(redTeamPlayer2));
    }
}
