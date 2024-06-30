package com.designPatterns.behavioral.chainOfResponsibility;

public class BudgetRequest extends Request {

    private final int amount;

    public BudgetRequest(int amount) {
        super(RequestType.BUDGET);
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
