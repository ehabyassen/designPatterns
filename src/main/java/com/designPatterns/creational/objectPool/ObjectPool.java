package com.designPatterns.creational.objectPool;

import java.util.ArrayList;
import java.util.List;

public class ObjectPool<T> {

    private List<T> objects;

    public ObjectPool(int size, Class<T> type) {
        objects = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            objects.add(createNew(type));
        }
    }

    private T createNew(Class<T> type) {
        try {
            return type.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to create a new instance of " + type.getName(), e);
        }
    }

    public T getObject() {
        T object = objects.get(0);
        objects.remove(0);
        return object;
    }

    public void returnObject(T object) {
        objects.add(object);
    }

    public int getSize() {
        return objects.size();
    }
}
