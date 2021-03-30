package com.switchfully.exceptions;

public class OrderCouldNotBeCreatedException extends RuntimeException{

    public OrderCouldNotBeCreatedException(String message) {
        super(message);
    }
}
