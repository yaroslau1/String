package com.work.main;

import com.work.enums.BracketsType;
import com.work.exception.BracketsException;
import com.work.factory.BracketsFactory;
import com.work.file.Read;
import com.work.memory.Memory;
import com.work.scaners.ConsoleScanner;
import com.work.threads.ThreadRead;

import java.io.File;
import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        ConsoleScanner consoleScanner = new ConsoleScanner();
        BiConsumer<BracketsType, String> check = (bracket, s) -> {
            try {
                BracketsFactory.checkString(bracket, s);
            } catch (BracketsException e) {
                System.out.println(e);
                System.out.println(e.getOpen() + " " + e.getClose());
                e.printStackTrace();
            }
        };
        Memory memory = new Memory();
        String string;
        boolean exit = true;
        do {
            System.out.println("Menu");
            System.out.println("Press 0 to EXIT");
            System.out.println("Press 1 to ENTER new string");
            System.out.println("Press 2 to SHOW all string");
            System.out.println("Press 3 to READ from file");
            System.out.println("Press 4 to GO 1000 threads");
            switch (consoleScanner.enterInt()) {
                case 0:
                    exit = false;
                    break;
                case 1:
                    string = consoleScanner.enterString();
                    memory.saveString(string);
                    check.accept(BracketsType.ROUND, string);
                    check.accept(BracketsType.CURLY, string);
                    check.accept(BracketsType.TRIANGULAR, string);
                    check.accept(BracketsType.SQUARE, string);
                    break;
                case 2:
                    memory.showMemory();
                    break;
                case 3:
                    File path = new File("src/main/resources/file.txt");
                    string = new Read().reading(path.getAbsolutePath());
                    memory.saveString(string);
                    break;
                case 4:
                    for (int i = 1; i <= 1000; i++) {
                        ThreadRead threadRead = new ThreadRead(i);
                        threadRead.start();
                    }
                    break;
                default:
                    System.out.println("Wrong command. Retry");
                    break;
            }
        } while (exit);

        System.out.println("Good bye");


    }
}
