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
}
