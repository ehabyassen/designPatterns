package com.solid.lsp.problem1;

public class Document {

    private final String fileName;
    private String data;

    public Document(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void open() {
        System.out.println("Opening document " + fileName + "...");
    }
}
