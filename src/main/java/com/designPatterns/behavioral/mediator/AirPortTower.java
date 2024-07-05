package com.designPatterns.behavioral.mediator;

public abstract class AirPortTower {

    abstract void register(AirCraft airCraft);

    abstract void requestLanding(AirCraft airCraft);

    abstract void notifySuccess(String airCraftName);
}
