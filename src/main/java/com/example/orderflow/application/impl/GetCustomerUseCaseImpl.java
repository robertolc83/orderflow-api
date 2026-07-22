package com.example.orderflow.application.impl;

import org.springframework.stereotype.Service;

import com.example.orderflow.application.usescase.GetCustomerUseCase;
import com.example.orderflow.domain.exception.CustomerNotFoundException;
import com.example.orderflow.domain.model.Customer;
import com.example.orderflow.domain.port.CustomerRepositoryPort;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GetCustomerUseCaseImpl implements GetCustomerUseCase {

    private final CustomerRepositoryPort repositoryPort;

    @Override
    public Customer execute(Long id) {

        return repositoryPort.findById(id)
                .orElseThrow(() -> 
                    new CustomerNotFoundException(id));
    }

}
