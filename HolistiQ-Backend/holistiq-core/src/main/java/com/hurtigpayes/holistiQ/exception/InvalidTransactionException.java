package com.hurtigpayes.holistiQ.exception;

public class InvalidTransactionException extends RuntimeException {
    public InvalidTransactionException(String error) {
        super(error);
    }
}
