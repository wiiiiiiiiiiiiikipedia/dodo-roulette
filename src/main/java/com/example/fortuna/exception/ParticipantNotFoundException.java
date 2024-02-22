package com.example.fortuna.exception;

import java.util.function.Supplier;

public class ParticipantNotFoundException extends Exception{

    public ParticipantNotFoundException() {
    }

    public ParticipantNotFoundException(String message) {
        super(message);
    }
}
