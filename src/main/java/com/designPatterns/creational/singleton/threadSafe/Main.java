package com.designPatterns.creational.singleton.threadSafe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println(ThreadSafeSingleton.getInstance()));
        Thread t2 = new Thread(() -> System.out.println(ThreadSafeSingleton.getInstance()));
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.execute(t1);
        es.execute(t2);
        es.shutdown();
    }
}
