package com.hurtigpayes.holistiQ.exception;

public class BadRequestException extends RuntimeException {
    public BadRequestException(String error){
        super(error);
    }
}
