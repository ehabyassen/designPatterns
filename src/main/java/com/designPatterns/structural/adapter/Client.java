package com.designPatterns.structural.adapter;

public class Client {

    public static void main(String[] args) {
        ClientInterface adapter = new Adapter(new Service());
        adapter.method("Test");
    }
}
