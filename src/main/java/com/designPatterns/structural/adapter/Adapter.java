package com.designPatterns.structural.adapter;

public class Adapter implements ClientInterface {

    private final Service service;

    public Adapter(Service service) {
        this.service = service;
    }

    @Override
    public void method(String data) {
        String specialData = convertToServiceFormat(data);
        service.serviceMethod(specialData);
    }

    private String convertToServiceFormat(String data) {
        return "[" + data + "]";
    }
}
