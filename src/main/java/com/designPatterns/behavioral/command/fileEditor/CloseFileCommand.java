package com.designPatterns.behavioral.command.fileEditor;

public class CloseFileCommand extends Command {

    public CloseFileCommand(FileSystemReceiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.closeFile();
    }
}
