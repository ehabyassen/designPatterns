package com.designPatterns.behavioral.chainOfResponsibility;

public class Client {

    public static void main(String[] args) {
        Request conferenceRequest = new ConferenceRequest();
        Handler director = new Director();
        director.handleRequest(conferenceRequest);

        Request smallBudgetRequest = new BudgetRequest(1500);
        director.handleRequest(smallBudgetRequest);

        BudgetRequest bigBudgetRequest = new BudgetRequest(2000);
        director.handleRequest(bigBudgetRequest);
    }
}
