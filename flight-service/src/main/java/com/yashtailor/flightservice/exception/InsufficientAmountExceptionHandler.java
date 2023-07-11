package com.yashtailor.flightservice.exception;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class InsufficientAmountExceptionHandler {
    @ExceptionHandler(InsufficientAmountException.class)
    public ResponseEntity<String> exception() {
        return new ResponseEntity<>("Insufficient Amount ! ", HttpStatus.NOT_ACCEPTABLE);
    }
}
