package com.serenitydojo.calculator;

public class IllegalMathsOperatorException extends RuntimeException {
    public IllegalMathsOperatorException(String message) {
        super(message);
    }

    public IllegalMathsOperatorException(String message, Throwable cause) {
        super(message, cause);
    }
}
