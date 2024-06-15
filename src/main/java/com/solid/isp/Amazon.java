package com.solid.isp;

public class Amazon implements CloudStorageProvider, CloudHostingProvider, CDNProvider {

    @Override
    public void storeFile(String fileName) {
        System.out.println("Storing file " + fileName + "...");
    }

    @Override
    public void getFile(String fileName) {
        System.out.println("Retrieving file " + fileName + "...");
    }

    @Override
    public void createServer(String region) {
        System.out.println("Creating server in region " + region + "...");
    }

    @Override
    public void listServers(String region) {
        System.out.println("Listing servers in region " + region + "...");
    }

    @Override
    public void getCDNAddress() {
        System.out.println("Retrieving CDN Address...");
    }
}
