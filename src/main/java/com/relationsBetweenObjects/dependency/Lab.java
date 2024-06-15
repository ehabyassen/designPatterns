package com.relationsBetweenObjects.dependency;

public class Lab implements Teachable {

    private final String name;
    private final String room;
    private final int seats;

    public Lab(String name, String room, int seats) {
        this.name = name;
        this.room = room;
        this.seats = seats;
    }

    @Override
    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Lab{" +
                "name='" + name + '\'' +
                ", room='" + room + '\'' +
                ", seats=" + seats +
                '}';
    }
}
