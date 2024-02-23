package com.example.fortuna.exception;

public class AlreadyWonException extends Exception {

    public AlreadyWonException() {
        super();
    }

    public AlreadyWonException(String message) {
        super(message);
    }
}
