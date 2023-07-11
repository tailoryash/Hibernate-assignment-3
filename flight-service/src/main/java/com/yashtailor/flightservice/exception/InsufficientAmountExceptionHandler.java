package com.yashtailor.flightservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class InsufficientAmountExceptionHandler{
    @ExceptionHandler(InsufficientAmountException.class)
    public ResponseEntity<String> exception(){
        return new ResponseEntity<>("Insufficient Amount ! ", HttpStatus.NOT_ACCEPTABLE);
    }
}
