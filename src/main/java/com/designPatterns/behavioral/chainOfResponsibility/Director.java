package com.designPatterns.behavioral.chainOfResponsibility;

public class Director extends Handler {

    protected Director() {
        successor = new VP();
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType().equals(RequestType.CONFERENCE)) {
            System.out.println("Director can approve conferences...");
        } else {
            System.out.println("Director can approve only conference requests. Passing the request up the chain...");
            successor.handleRequest(request);
        }
    }
}
