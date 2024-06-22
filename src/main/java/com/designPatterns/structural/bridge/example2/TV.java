package com.designPatterns.structural.bridge.example2;

public class TV implements Device {

    private boolean enabled;
    private int volume;
    private int channel;

    @Override
    public boolean isEnabled() {
        System.out.println("Checking if TV is enabled...");
        return enabled;
    }

    @Override
    public void enable() {
        System.out.println("Enabling TV...");
        enabled = true;
    }

    @Override
    public void disable() {
        System.out.println("Disabling TV...");
        enabled = false;
    }

    @Override
    public int getVolume() {
        System.out.println("Returning TV volume...");
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Setting TV volume...");
        this.volume = volume;
    }

    @Override
    public int getChannel() {
        System.out.println("Returning TV channel...");
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Setting TV channel...");
        this.channel = channel;
    }
}
