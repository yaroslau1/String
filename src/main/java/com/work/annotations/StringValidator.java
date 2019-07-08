package com.work.annotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class StringValidator implements ConstraintValidator<CheckBrackets, String> {
    @Override
    public void initialize(CheckBrackets annotation) {
        System.out.println("");
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(s != null || !s.equals("")){
            return true;
        }
        return false;
    }

}
