package com.designPatterns.behavioral.command.fileEditor;

import java.util.List;

public class FileSystemClient {

    public static void main(String[] args) {
        FileSystemReceiver fileSystem = FileSystemReceiverUtil.getFileSystemReceiver();

        List<Command> commands = List.of(
                new OpenFileCommand(fileSystem),
                new WriteFileCommand(fileSystem),
                new CloseFileCommand(fileSystem)
        );

        commands.forEach(command -> new CommandInvoker(command).execute());
    }
}
