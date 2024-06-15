package com.designPatterns.behavioral.command.fileEditor;

public class OpenFileCommand extends Command {

    public OpenFileCommand(FileSystemReceiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.openFile();
    }
}
