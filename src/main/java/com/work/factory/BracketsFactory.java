package com.work.factory;

import com.work.brackets.*;
import com.work.enums.BracketsType;
import com.work.exception.BracketsException;

public class BracketsFactory {

    public static Brackets checkString(BracketsType bracketsType, String string) throws BracketsException {
        Brackets brackets = null;
        switch (bracketsType) {
            case ROUND:
                brackets = new RoundBrackets(string);
                break;

            case SQUARE:
                brackets = new SquareBrackets(string);
                break;

            case TRIANGULAR:
                brackets = new TriangularBrackets(string);
                break;

            case CURLY:
                brackets = new CurlyBrackets(string);
                break;
        }
        return brackets;
    }
}
