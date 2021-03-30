package com.switchfully.exceptions;

public class CouldNotCreateCustomerException extends RuntimeException{

    public CouldNotCreateCustomerException(String message) {
        super(message);
    }
}
