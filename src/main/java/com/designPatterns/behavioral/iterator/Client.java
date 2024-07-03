package com.designPatterns.behavioral.iterator;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        Collection collection = new Collection(List.of("A", "B", "C"));
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
