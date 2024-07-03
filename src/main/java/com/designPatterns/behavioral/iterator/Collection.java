package com.designPatterns.behavioral.iterator;

import java.util.List;

public class Collection implements Iterable {

    private final List<String> elements;

    public Collection(List<String> elements) {
        this.elements = elements;
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }

    public String get(int index) {
        return elements.get(index);
    }

    public int size() {
        return elements.size();
    }
}
