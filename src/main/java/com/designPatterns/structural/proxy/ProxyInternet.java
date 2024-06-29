package com.designPatterns.structural.proxy;

public class ProxyInternet implements Internet {

    private final RealInternet realInternet;

    public ProxyInternet(RealInternet realInternet) {
        this.realInternet = realInternet;
    }

    @Override
    public void grantInternetAccess(Employee employee) {
        if (employee.getSecurityLevel() > 5) {
            System.out.println("Pre-processing call to real internet...");
            realInternet.grantInternetAccess(employee);
            System.out.println("Post-processing call to real internet...");
        } else {
            System.out.println("Permission Denied...");
        }
    }
}
