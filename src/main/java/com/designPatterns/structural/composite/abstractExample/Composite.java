package com.designPatterns.structural.composite.abstractExample;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private final List<Component> children;

    public Composite() {
        this.children = new ArrayList<>();
    }

    public void add(Component child) {
        children.add(child);
    }

    public void remove(Component child) {
        children.remove(child);
    }

    public List<Component> getChildren() {
        return children;
    }

    @Override
    public void execute() {
        children.forEach(Component::execute);
    }
}
