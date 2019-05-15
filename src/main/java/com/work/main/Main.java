package com.work.main;

import com.work.brackets.Brackets;
import com.work.exception.BracketsException;
import com.work.scaners.ConsoleScanner;

public class Main {
    public static void main(String[] args) {
        ConsoleScanner consoleScanner = new ConsoleScanner();
        Brackets brackets = new Brackets();
        try {
            brackets.checkString(consoleScanner.enterString(), "(){}[]<>");
        } catch (BracketsException e) {
            System.out.println(e);
            System.out.println(e.getOpen() + " " + e.getClose());
            e.printStackTrace();
        }
    }
}
