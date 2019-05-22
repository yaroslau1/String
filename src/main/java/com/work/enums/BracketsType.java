package com.work.enums;

public enum BracketsType {
    ROUND('(', ')'),
    CURLY('{', '}'),
    TRIANGULAR('<', '>'),
    SQUARE('[', ']');

    private final char open;
    private final char close;

    BracketsType(char open, char close){
        this.open = open;
        this.close = close;
    }

    public char getOpen() {
        return open;
    }

    public char getClose() {
        return close;
    }
}
