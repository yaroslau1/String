package com.work.interfaces;

import com.work.brackets.Brackets;
import com.work.enums.BracketsType;
import com.work.exception.BracketsException;

public interface ICheckString {
    void checkBracket(BracketsType brackets, String string) throws BracketsException;
}
