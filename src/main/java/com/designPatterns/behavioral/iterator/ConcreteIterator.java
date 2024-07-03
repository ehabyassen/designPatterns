package com.designPatterns.behavioral.iterator;

import java.util.concurrent.atomic.AtomicInteger;

public class ConcreteIterator implements Iterator {

    private final Collection collection;
    private final AtomicInteger index;

    public ConcreteIterator(Collection collection) {
        this.collection = collection;
        index = new AtomicInteger();
    }

    @Override
    public String next() {
        return collection.get(index.getAndIncrement());
    }

    @Override
    public boolean hasNext() {
        return index.get() < collection.size();
    }
}
