package com.work.main;

import com.work.enums.BracketsType;
import com.work.exception.BracketsException;
import com.work.factory.BracketsFactory;
import com.work.memory.Memory;
import com.work.scaners.ConsoleScanner;

public class Main {
    public static void main(String[] args) {
        ConsoleScanner consoleScanner = new ConsoleScanner();
        Memory memory = new Memory();
        boolean exit = true;
        do {
            System.out.println("Menu");
            System.out.println("Press 0 to EXIT");
            System.out.println("Press 1 to ENTER new string");
            System.out.println("Press 2 to SHOW all string");
            switch (consoleScanner.enterInt()) {
                case 0:
                    exit = false;
                    break;
                case 1:
                    String string = consoleScanner.enterString();
                    memory.saveString(string);
                    try {
                        BracketsFactory.checkString(BracketsType.ROUND, string);
                        BracketsFactory.checkString(BracketsType.CURLY, string);
                        BracketsFactory.checkString(BracketsType.TRIANGULAR, string);
                        BracketsFactory.checkString(BracketsType.SQUARE, string);
                    } catch (BracketsException e) {
                        System.out.println(e);
                        System.out.println(e.getOpen() + " " + e.getClose());
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    memory.showMemory();
                    break;
                default:
                    System.out.println("Wrong command. Retry");
                    break;
            }
        } while (exit);

        System.out.println("Good bye");


    }
}
