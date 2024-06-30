package com.designPatterns.behavioral.chainOfResponsibility;

public class VP extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType().equals(RequestType.BUDGET)) {
            if (((BudgetRequest) request).getAmount() <= 1500) {
                System.out.println("VP can approve budget request with amount up to 1500...");
            } else {
                System.out.println("VP can approve budget request with amount up to 1500. Passing the request up the chain...");
                successor.handleRequest(request);
            }
        } else {
            System.out.println("VP can approve only budget requests. Passing request up the chain...");
            successor.handleRequest(request);
        }
    }
}
