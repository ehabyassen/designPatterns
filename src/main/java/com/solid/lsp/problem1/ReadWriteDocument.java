package com.solid.lsp.problem1;

public class ReadWriteDocument extends Document {

    public ReadWriteDocument(String fileName) {
        super(fileName);
    }

    public void save() {
        System.out.println("Saving document " + getFileName() + "...");
    }
}
