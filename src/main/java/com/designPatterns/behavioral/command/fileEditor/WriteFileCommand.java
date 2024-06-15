package com.designPatterns.behavioral.command.fileEditor;

public class WriteFileCommand extends Command {

    public WriteFileCommand(FileSystemReceiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.writeFile();
    }
}
