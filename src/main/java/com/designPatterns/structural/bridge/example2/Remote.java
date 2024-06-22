package com.designPatterns.structural.bridge.example2;

public class Remote {

    private final Device device;

    public Remote(Device device) {
        this.device = device;
    }

    protected Device getDevice() {
        return device;
    }

    public void togglePower() {
        if (device.isEnabled()) device.disable();
        else device.enable();
    }

    public void volumeDown() {
        if (device.getVolume() > 0) device.setVolume(device.getVolume() - 1);
    }

    public void volumeUp() {
        if (device.getVolume() < 100) device.setVolume(device.getVolume() + 1);
    }

    public void channelDown() {
        if (device.getChannel() > 0) device.setChannel(device.getChannel() - 1);
    }

    public void channelUp() {
        if (device.getChannel() < 100) device.setChannel(device.getChannel() + 1);
    }
}
