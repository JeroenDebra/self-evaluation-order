package com.switchfully.exceptions;

public class CouldNotCreateItemException extends RuntimeException{

    public CouldNotCreateItemException(String message) {
        super(message);
    }
}
