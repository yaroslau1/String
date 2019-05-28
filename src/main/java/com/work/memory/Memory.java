package com.work.memory;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Memory {

    private List<String> dictionary;
    private LocalTime createTime;
    private LocalTime lastCacheClean;
    private static final int MEMORY_CLEAN_INTERVAL = 60;

    public Memory() {
        dictionary = new ArrayList<>();
        createTime = LocalTime.now();
        lastCacheClean = createTime;
    }

    public void saveString(String string) {
        cleanCash();
        dictionary.add(string);
    }

    public void showMemory() {
        cleanCash();
        if (dictionary.isEmpty()) {
            System.out.println("Memory is empty");
        } else {
            for (String i : dictionary) {
                System.out.println(i);
            }
        }
    }

    private void cleanCash() {
        Duration duration = Duration.between(lastCacheClean, LocalTime.now());
        if (duration.getSeconds() >= MEMORY_CLEAN_INTERVAL) {
            lastCacheClean = LocalTime.now();
            dictionary.clear();
        }
    }
}
