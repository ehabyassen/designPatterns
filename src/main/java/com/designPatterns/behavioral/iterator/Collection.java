package com.designPatterns.behavioral.iterator;

import java.util.List;

public class Collection<T> implements Iterable<T> {

    private final List<T> elements;

    public Collection(List<T> elements) {
        this.elements = elements;
    }

    @Override
    public Iterator<T> iterator() {
        return new ConcreteIterator<>(this);
    }

    public T get(int index) {
        return elements.get(index);
    }

    public int size() {
        return elements.size();
    }
}
