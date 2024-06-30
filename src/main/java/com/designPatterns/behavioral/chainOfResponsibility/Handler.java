package com.designPatterns.behavioral.chainOfResponsibility;

public abstract class Handler {

    protected Handler successor;

    public abstract void handleRequest(Request request);
}
