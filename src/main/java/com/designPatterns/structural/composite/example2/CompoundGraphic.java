package com.designPatterns.structural.composite.example2;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements Graphic {

    private final List<Graphic> children;

    public CompoundGraphic() {
        children = new ArrayList<>();
    }

    public void add(Graphic child) {
        children.add(child);
    }

    public void remove(Graphic child) {
        children.remove(child);
    }


    @Override
    public void move(int x, int y) {
        children.forEach(child -> child.move(x, y));
    }

    @Override
    public void draw() {
        children.forEach(Graphic::draw);
    }
}
