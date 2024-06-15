package com.relationsBetweenObjects.composition;

public class Department {

    private String name;
    private String buildingNumber;

    public Department(String name, String buildingNumber) {
        this.name = name;
        this.buildingNumber = buildingNumber;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", buildingNumber='" + buildingNumber + '\'' +
                '}';
    }
}
