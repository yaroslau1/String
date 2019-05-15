package com.work.exception;

public class BracketsException extends Exception {
    private char open;
    private char close;

    public BracketsException (String description, char open, char close){
        super(description);
        this.open = open;
        this.close = close;
    }

    public char getOpen(){
        return open;
    }

    public char getClose(){
        return close;
    }

}
