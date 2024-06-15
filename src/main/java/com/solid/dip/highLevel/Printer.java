package com.solid.dip.highLevel;

public class Printer {

    private final Reader reader;

    public Printer(Reader reader) {
        this.reader = reader;
    }

    public void printFile() {
        reader.readFile();
        System.out.println("Printing File...");
    }
}

/*
High level class depends on its abstraction
 */