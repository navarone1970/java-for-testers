package com.serenitydojo.exceptions;

import java.io.IOException;

public class FileHasNoWordException extends RuntimeException {
//    public class FileHasNoWordException extends RuntimeException {
    public FileHasNoWordException(String message) {
        super(message);
    }

    public FileHasNoWordException(String message, Throwable cause) {
        super(message, cause);
    }
}
