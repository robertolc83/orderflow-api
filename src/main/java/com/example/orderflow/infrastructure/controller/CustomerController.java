package com.example.orderflow.infrastructure.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderflow.dto.request.CustomerRequest;
import com.example.orderflow.application.usescase.CreateCustomerUseCase;
import com.example.orderflow.application.usescase.GetCustomerUseCase;
import com.example.orderflow.domain.model.Customer;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CreateCustomerUseCase customerUseCase;
    private final GetCustomerUseCase getCustomerUseCase;

    @PostMapping
    public ResponseEntity<Customer> createCustomer(@Valid @RequestBody CustomerRequest request) {
        Customer newCustomer = customerUseCase.execute(request);
        return new ResponseEntity<>(newCustomer, HttpStatus.CREATED);
    }

    /**
     * TODO: ¿Por qué GetCustomerUseCase devuelve Customer y no CustomerResponse?
     * * Porque el caso de uso (capa de application) no debería conocer los DTOs.
     * Los DTO pertenecen a la infraestructura (la API REST).
     * El dominio trabaja con entidades del dominio.
     * * Más adelante podemos decidir si el mapeo se hace en el Controller o mediante un Mapper, 
     * pero por ahora mantener el caso de uso devolviendo Customer es una decisión sencilla 
     * y coherente.
     */
    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable Long id) {
        return new ResponseEntity<>(getCustomerUseCase.execute(id), HttpStatus.OK);
    }
}
