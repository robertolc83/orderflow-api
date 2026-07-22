package com.example.orderflow.domain.exception;

public class CustomerNotFoundException extends RuntimeException {

    public CustomerNotFoundException(Long id) {
        super("Customer con ID " + id + " no existe.");
    }

}
