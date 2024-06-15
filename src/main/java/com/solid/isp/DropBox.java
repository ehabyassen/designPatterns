package com.solid.isp;

public class DropBox implements CloudStorageProvider {

    @Override
    public void storeFile(String fileName) {
        System.out.println("Storing file " + fileName + "...");
    }

    @Override
    public void getFile(String fileName) {
        System.out.println("Retrieving file " + fileName + "...");
    }
}
