package com.designPatterns.creational.singleton.lazy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        /*
         * con: if two clients called getInstance() in the same timestamp to the millisecond, two instances will be
         * created. To solve this, use thread safe instantiation.
         */
        Thread t1 = new Thread(() -> System.out.println(LazySingleton.getInstance()));
        Thread t2 = new Thread(() -> System.out.println(LazySingleton.getInstance()));
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.execute(t1);
        es.execute(t2);
        es.shutdown();
    }
}