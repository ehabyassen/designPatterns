package com.designPatterns.behavioral.iterator;

import java.util.concurrent.atomic.AtomicInteger;

public class ConcreteIterator<T> implements Iterator<T> {

    private final Collection<T> collection;
    private final AtomicInteger index;

    public ConcreteIterator(Collection<T> collection) {
        this.collection = collection;
        index = new AtomicInteger();
    }

    @Override
    public T next() {
        return collection.get(index.getAndIncrement());
    }

    @Override
    public boolean hasNext() {
        return index.get() < collection.size();
    }
}
