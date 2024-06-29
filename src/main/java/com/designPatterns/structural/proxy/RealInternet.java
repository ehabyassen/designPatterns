package com.designPatterns.structural.proxy;

public class RealInternet implements Internet {

    @Override
    public void grantInternetAccess(Employee employee) {
        System.out.println("Granting internet access for employee " + employee.getName() +
                " with security level " + employee.getSecurityLevel());
    }
}
