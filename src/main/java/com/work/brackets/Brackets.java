package com.work.brackets;

import com.work.exception.BracketsException;

public class Brackets {

    private int counter = 0;
    private int error = 0;

    public void checkString(String string, String brackets) throws BracketsException {
        char[] stringToArray = string.toCharArray();
        char[] bracketsToArray = brackets.toCharArray();
        for(int i = 0; i < bracketsToArray.length - 1; i+=2) {
            char open = bracketsToArray[i];
            char close = bracketsToArray[i+1];
            for (char symbol : stringToArray) {
                typeOfBracket(open, close, symbol);
            }
            if (counter < 0 || counter > 0 || error > 0) {
                throw new BracketsException("error with brackets: ", open, close);
            } else {
                System.out.println("no errors with brackets: " + open + " " + close);
            }
            counter = 0;
            error = 0;
        }
    }

    private void typeOfBracket(char open, char close, char symbol) {
        if (symbol == open) {
            counter++;
        }
        if (symbol == close) {
            counter--;
            if (counter < 0) {
                error++;
            }
        }
    }
}
