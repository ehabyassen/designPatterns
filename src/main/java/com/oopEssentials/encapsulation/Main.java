package com.oopEssentials.encapsulation;

public class Main {

    public static void main(String[] args) {
        var account = new Account();
//        account.balance = -1; //direct change of the state of the object. this should not be allowed. it should be done throw a mutator method
        account.deposit(10);
        System.out.println(account.getBalance());
        account.withdraw(5);
        System.out.println(account.getBalance());
    }
}
