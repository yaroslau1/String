package com.work.brackets;

import com.work.enums.BracketsType;
import com.work.exception.BracketsException;

public abstract class Brackets {

    private BracketsType bracketsType;

    public Brackets(BracketsType bracketsType, String string) throws BracketsException {
        this.bracketsType = bracketsType;
        checkString(string);
    }

    public BracketsType getBracketsType() {
        return bracketsType;
    }

    public void checkString(String string) throws BracketsException {
        char[] stringToArray = string.toCharArray();
        int counter = 0;
        char open = bracketsType.getOpen();
        char close = bracketsType.getClose();
        for (char symbol : stringToArray) {
            if (symbol == open) {
                counter++;
            }
            if (symbol == close) {
                counter--;
            }
        }
        if (counter < 0 || counter > 0) {
            throw new BracketsException("error with brackets: ", open, close);
        } else {
            System.out.println("no errors with brackets: " + open + " " + close);
        }
    }


    /*private int counter = 0;
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
    }*/
}
