package com.designPatterns.behavioral.iterator;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        executeExample1();
        System.out.println("#".repeat(50));
        executeExample2();
        System.out.println("#".repeat(50));
        executeExample3();
    }

    private static void executeExample1() {
        Collection<String> collection = new Collection<>(List.of("A", "B", "C"));
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void executeExample2() {
        Collection<Integer> collection = new Collection<>(List.of(1, 2, 3));
        Iterator<Integer> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void executeExample3() {
        List<Student> students = List.of(new Student("John", "Doe"),
                                         new Student("Maria", "Schneider"),
                                         new Student("Michael", "Schmidt"));
        Collection<Student> collection = new Collection<>(students);
        Iterator<Student> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
