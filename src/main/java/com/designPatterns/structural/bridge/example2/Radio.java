package com.designPatterns.structural.bridge.example2;

public class Radio implements Device {

    private boolean enabled;
    private int volume;
    private int channel;

    @Override
    public boolean isEnabled() {
        System.out.println("Checking if Radio is enabled...");
        return enabled;
    }

    @Override
    public void enable() {
        System.out.println("Enabling Radio...");
        enabled = true;
    }

    @Override
    public void disable() {
        System.out.println("Disabling Radio...");
        enabled = false;
    }

    @Override
    public int getVolume() {
        System.out.println("Returning Radio volume...");
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Setting Radio volume...");
        this.volume = volume;
    }

    @Override
    public int getChannel() {
        System.out.println("Returning Radio channel...");
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Setting Radio channel...");
        this.channel = channel;
    }
}
