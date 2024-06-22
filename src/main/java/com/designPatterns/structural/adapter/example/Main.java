package com.designPatterns.structural.adapter.example;

public class Main {

    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);

        SquarePeg bigSquarePeg = new SquarePeg(10);
        RoundPeg bigRoundPeg = new SquarePegAdapter(bigSquarePeg);
        System.out.println(roundHole.fits(bigRoundPeg));

        SquarePeg smallSquarePeg = new SquarePeg(4);
        RoundPeg smallRoundPeg = new SquarePegAdapter(smallSquarePeg);
        System.out.println(roundHole.fits(smallRoundPeg));
    }
}
