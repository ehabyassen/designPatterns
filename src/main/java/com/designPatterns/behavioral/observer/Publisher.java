package com.designPatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {

    private final List<Subscriber> subscribers;

    public Publisher() {
        subscribers = new ArrayList<>();
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(String message) {
        subscribers.forEach(subscriber -> subscriber.update(message));
    }
}
