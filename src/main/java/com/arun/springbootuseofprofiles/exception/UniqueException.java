package com.arun.springbootuseofprofiles.exception;

public class UniqueException extends RuntimeException {
    public UniqueException(String message) {
        super(message);
    }
}
