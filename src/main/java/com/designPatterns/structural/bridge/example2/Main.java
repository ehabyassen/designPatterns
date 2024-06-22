package com.designPatterns.structural.bridge.example2;

public class Main {

    public static void main(String[] args) {
        Device lg = new TV();
        AdvancedRemote lgRemote = new AdvancedRemote(lg);
        lgRemote.volumeUp();
        lgRemote.volumeUp();
        lgRemote.volumeUp();
        System.out.println(lg.getVolume());
        lgRemote.mute();
        System.out.println(lg.getVolume());
    }
}
