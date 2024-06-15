package com.solid.dip;

import com.solid.dip.highLevel.Printer;
import com.solid.dip.highLevel.Reader;
import com.solid.dip.lowLevel.FileReader;

public class Main {

    public static void main(String[] args) {
        Reader reader = new FileReader();
        Printer printer = new Printer(reader);
        printer.printFile();
    }
}
