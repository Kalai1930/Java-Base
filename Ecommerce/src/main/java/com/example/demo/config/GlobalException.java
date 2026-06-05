package com.example.demo.config;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

	// validation exception
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String validationException(
            MethodArgumentNotValidException e) {

        return e.getBindingResult()
                .getFieldError()
                .getDefaultMessage();
    }

    // runtime exception
    @ExceptionHandler(RuntimeException.class)
    public String runtimeException(
            RuntimeException e) {

        return e.getMessage();
    }

    // all exceptions
    @ExceptionHandler(Exception.class)
    public String allException(
            Exception e) {

        return "something went wrong";
    }
}

