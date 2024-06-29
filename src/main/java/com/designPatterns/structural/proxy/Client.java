package com.designPatterns.structural.proxy;

public class Client {

    public static void main(String[] args) {
        Employee john = new Employee(4, "John");
        ProxyInternet internet = new ProxyInternet(new RealInternet());
        internet.grantInternetAccess(john);

        john.setSecurityLevel(6);
        internet.grantInternetAccess(john);
    }
}
