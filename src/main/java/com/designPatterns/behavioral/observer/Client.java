package com.designPatterns.behavioral.observer;

public class Client {

    public static void main(String[] args) {
        Subscriber sub1 = new Subscriber("sub1");
        Subscriber sub2 = new Subscriber("sub2");

        Publisher publisher = new Publisher();
        publisher.subscribe(sub1);
        publisher.subscribe(sub2);
        publisher.notifySubscribers("message#1");

        publisher.unsubscribe(sub2);
        publisher.notifySubscribers("message#2");
    }
}
