package com.designPatterns.structural.adapter.example;

public class SquarePegAdapter extends RoundPeg {

    private final SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        super(getRadius(peg));
        this.peg = peg;
    }

    private static int getRadius(SquarePeg peg) {
        return (int) (peg.getWidth() * Math.sqrt(2) / 2);
    }
}
