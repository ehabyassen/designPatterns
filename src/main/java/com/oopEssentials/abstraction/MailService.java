package com.oopEssentials.abstraction;

public class MailService {

    /**
     * hiding implementation details for send mail so the class that consumes MailService finds it easy to do so.
     * is any of the private methods are changed, this does not affect the points where sendMail is consumed.
     * we care about WHAT sendMail does not HOW it does it.
     */

    public void sendMail() {
        connect(1);
        authenticate();
        System.out.println("Sending mail...");
        disconnect();
    }

    private void connect(int timeout) {
        System.out.println("Connecting...");
    }

    private void disconnect() {
        System.out.println("Disconnecting...");
    }

    private void authenticate() {
        System.out.println("Authenticating...");
    }
}
