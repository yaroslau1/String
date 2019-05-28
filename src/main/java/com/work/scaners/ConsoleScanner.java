package com.work.scaners;

import java.util.Scanner;

public class ConsoleScanner {

    public String enterString( ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        return scanner.nextLine();
    }

    public int enterInt( ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter command: ");
        return scanner.nextInt();
    }
}
