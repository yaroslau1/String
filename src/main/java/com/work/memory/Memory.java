package com.work.memory;

import com.work.annotations.CheckBrackets;
import com.work.exception.BracketsException;

import javax.validation.constraints.NotNull;
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

    public static void main(String[] args) {
        saveStringTest(null);
    }

    @CheckBrackets
    public static void saveStringTest(@NotNull @CheckBrackets String string) {
        System.out.println(string);
    }

    public void saveString(@CheckBrackets String string) {
        System.out.println(string);
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
