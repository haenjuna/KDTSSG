package org.example.file;

import java.io.File;
public class FileList {

    private final String path;


    public FileList(String path) {
        this.path = path;
    }

    public File[] listFiles() {
        File directory = new File(path);
        File[] files = directory.listFiles((dir, name) -> name.toLowerCase().endsWith(".jpg"));
        return files;
    }
}
