package com.designPatterns.behavioral.iterator;

public interface Iterator<T> {

    T next();

    boolean hasNext();
}
