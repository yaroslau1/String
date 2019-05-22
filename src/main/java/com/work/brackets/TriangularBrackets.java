package com.work.brackets;

import com.work.enums.BracketsType;
import com.work.exception.BracketsException;

public class TriangularBrackets extends Brackets {
    public TriangularBrackets(String string) throws BracketsException {
        super(BracketsType.TRIANGULAR, string);
    }
}
