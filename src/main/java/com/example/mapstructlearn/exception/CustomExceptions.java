package com.example.mapstructlearn.exception;

import java.util.NoSuchElementException;

public class CustomExceptions{
    public static class CustomException extends Exception {
        public CustomException(String message) {
            super(message);
        }
    }

    public static class NoValueException extends NoSuchElementException {
        public NoValueException(String message) {
            super(message);
        }
    }
}

