package com.designPatterns.structural.bridge.example2;

public class AdvancedRemote extends Remote {

    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        getDevice().setVolume(0);
    }
}
