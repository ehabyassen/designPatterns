package com.designPatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAirPortTower extends AirPortTower {

    private List<AirCraft> airCrafts;

    @Override
    void register(AirCraft airCraft) {
        if (airCrafts == null) {
            airCrafts = new ArrayList<>();
        }
        airCrafts.add(airCraft);
        System.out.println("Registered " + airCraft + "...");
    }

    @Override
    void requestLanding(AirCraft airCraft) {
        System.out.println(airCraft.getName() + " requests landing...");
        airCraft.notify("Landing Runway is available...");
        airCrafts.stream()
                .filter(ac -> !ac.equals(airCraft) && !ac.isLanded())
                .forEach(ac -> ac.notify("Landing Runway is busy..."));
    }

    @Override
    void notifySuccess(String airCraftName) {
        System.out.println(airCraftName + " notifies success...");
        airCrafts.stream()
                .filter(ac -> !ac.getName().equals(airCraftName) && !ac.isLanded())
                .forEach(ac -> ac.notify("Landing Runway is now Available..."));
    }
}
