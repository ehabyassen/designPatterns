package com.designPatterns.behavioral.chainOfResponsibility;

public class Client {

    public static void main(String[] args) {
        Handler director = new Director();
        Handler vp = new VP();
        Handler ceo = new CEO();

        director.setSuccessor(vp);
        vp.setSuccessor(ceo);

        Request conferenceRequest = new ConferenceRequest();
        director.handleRequest(conferenceRequest);

        Request smallBudgetRequest = new BudgetRequest(1500);
        director.handleRequest(smallBudgetRequest);

        BudgetRequest bigBudgetRequest = new BudgetRequest(2000);
        director.handleRequest(bigBudgetRequest);
    }
}
