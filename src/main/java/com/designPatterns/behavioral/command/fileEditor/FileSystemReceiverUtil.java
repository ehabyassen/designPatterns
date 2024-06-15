package com.designPatterns.behavioral.command.fileEditor;

public class FileSystemReceiverUtil {

    public static FileSystemReceiver getFileSystemReceiver() {
        String osName = System.getProperty("os.name");
        return (osName.contains("Windows")) ? new WindowsFileSystemReceiver() : new UnixFileSystemReceiver();
    }
}
