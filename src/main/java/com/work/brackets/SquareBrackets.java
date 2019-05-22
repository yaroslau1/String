package com.work.brackets;

import com.work.enums.BracketsType;
import com.work.exception.BracketsException;

public class SquareBrackets extends Brackets {
    public SquareBrackets(String string) throws BracketsException {
        super(BracketsType.SQUARE, string);
    }
}
