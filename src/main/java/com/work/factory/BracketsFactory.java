package com.work.factory;

import com.work.brackets.*;
import com.work.enums.BracketsType;
import com.work.exception.BracketsException;

public class BracketsFactory {

    public static void checkString(BracketsType bracketsType, String string) throws BracketsException {
        Brackets brackets = null;
        switch (bracketsType) {
            case ROUND:
                brackets = new RoundBrackets();
                brackets.checkString(string);
                break;

            case SQUARE:
                brackets = new SquareBrackets();
                brackets.checkString(string);
                break;

            case TRIANGULAR:
                brackets = new TriangularBrackets();
                brackets.checkString(string);
                break;

            case CURLY:
                brackets = new CurlyBrackets();
                brackets.checkString(string);
                break;
        }
    }
}
