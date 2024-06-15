package com.solid.dip.lowLevel;

import com.solid.dip.highLevel.Reader;

public class FileReader implements Reader {

    @Override
    public void readFile() {
        System.out.println("Reading File...");
    }
}

/*
Low level class depends on the abstraction of the high level class.
 */