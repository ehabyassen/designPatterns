package com.solid.isp;

public interface CloudHostingProvider {

    void createServer(String region);

    void listServers(String region);
}
