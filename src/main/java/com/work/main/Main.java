package com.work.main;

import com.work.enums.BracketsType;
import com.work.exception.BracketsException;
import com.work.factory.BracketsFactory;
import com.work.scaners.ConsoleScanner;

public class Main {
    public static void main(String[] args) {
        ConsoleScanner consoleScanner = new ConsoleScanner();
        String string = consoleScanner.enterString();
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
    }
}
