package com.designPatterns.behavioral.command.fileEditor;

public interface FileSystemReceiver {

    void openFile();

    void writeFile();

    void closeFile();
}
