package com.designPatterns.behavioral.state;

public class Context {

    public static void main(String[] args) {
        Worker worker = new Worker();

        System.out.println(worker.getCurrentBook());
        System.out.println(worker.getNextBook());
        System.out.println(worker.getNextBook());
        System.out.println(worker.getNextBook());
        System.out.println(worker.getNextBook());
    }
}
