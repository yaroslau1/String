package com.work.brackets;

import com.work.enums.BracketsType;
import com.work.exception.BracketsException;

public class RoundBrackets extends Brackets {

    public RoundBrackets(String string) throws BracketsException {
        super(BracketsType.ROUND, string);
    }
}
