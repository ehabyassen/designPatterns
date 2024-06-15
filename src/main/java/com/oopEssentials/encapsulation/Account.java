package com.oopEssentials.encapsulation;

public class Account {

    private float balance;

    public void deposit(float amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(float amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public void setBalance(float balance) {
        if (balance < 0) {
            System.out.println("Balance cannot be negative!");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public float getBalance() {
        return balance;
    }
}
