package com.work.threads;

import com.work.file.Read;

import java.io.File;

public class ThreadRead extends Thread {
    private int name;

    public ThreadRead(int name) {
        this.name = name;
    }

    @Override
    public void run() {
        Read read = new Read();
        File path = new File("src/main/resources/file.txt");
        System.out.println(read.reading(path.getAbsolutePath()) + " " + this.name);
    }
}
