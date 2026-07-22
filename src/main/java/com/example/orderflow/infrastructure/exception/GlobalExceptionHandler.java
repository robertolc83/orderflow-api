package com.example.orderflow.infrastructure.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.orderflow.domain.exception.CustomerNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    // TODO: Evaluar abstracción cuando existan múltiples excepciones de dominio
    @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity<ApiError> handleCustomerNotFound(
        CustomerNotFoundException ex) {

        ApiError error = new ApiError(
            HttpStatus.NOT_FOUND.value(),
            ex.getMessage(),
            LocalDateTime.now()
        );

        return ResponseEntity
            .status(HttpStatus.NOT_FOUND)
            .body(error);

    }

}
