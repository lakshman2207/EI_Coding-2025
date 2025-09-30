package com.astronaut.exception;

public class InvalidTimeFormatException extends RuntimeException {
    public InvalidTimeFormatException(String msg) {
        super(msg);
    }
}
