package com.work.brackets;

import com.work.enums.BracketsType;
import com.work.exception.BracketsException;

public class CurlyBrackets extends Brackets {

    public CurlyBrackets(String string) throws BracketsException {
        super(BracketsType.CURLY, string);
    }
}
