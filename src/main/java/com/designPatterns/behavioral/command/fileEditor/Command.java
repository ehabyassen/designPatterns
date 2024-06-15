package com.designPatterns.behavioral.command.fileEditor;

public abstract class Command {

    protected final FileSystemReceiver receiver;

    public Command(FileSystemReceiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}
