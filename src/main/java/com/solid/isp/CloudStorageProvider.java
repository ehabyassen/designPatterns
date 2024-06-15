package com.solid.isp;

public interface CloudStorageProvider {

    void storeFile(String fileName);

    void getFile(String fileName);
}
