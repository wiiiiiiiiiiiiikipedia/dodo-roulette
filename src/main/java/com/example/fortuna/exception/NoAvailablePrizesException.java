package com.example.fortuna.exception;

public class NoAvailablePrizesException extends Exception{

    public NoAvailablePrizesException() {
    }

    public NoAvailablePrizesException(String message) {
        super(message);
    }
}
