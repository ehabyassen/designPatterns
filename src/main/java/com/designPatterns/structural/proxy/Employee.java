package com.designPatterns.structural.proxy;

public class Employee {

    private int securityLevel;
    private String name;

    public Employee(int securityLevel, String name) {
        this.securityLevel = securityLevel;
        this.name = name;
    }

    public int getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(int securityLevel) {
        this.securityLevel = securityLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
