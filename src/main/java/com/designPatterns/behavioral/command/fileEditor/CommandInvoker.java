package com.designPatterns.behavioral.command.fileEditor;

public class CommandInvoker {

    private final Command command;

    public CommandInvoker(Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }
}
