package com.arun.springbootuseofprofiles.exception;

import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@ControllerAdvice
public class SchoolException extends ResponseEntityExceptionHandler {

    @ExceptionHandler(UniqueException.class)
    protected ResponseEntity<ExceptionResponse> handleDataNotFoundException(UniqueException e, WebRequest request) {
        ExceptionResponse exceptionResponse = new ExceptionResponse("UNIQUE_CONSTRAINT", e.getMessage());
        return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
