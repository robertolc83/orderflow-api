package com.example.orderflow.application.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.orderflow.application.usescase.CreateCustomerUseCase;
import com.example.orderflow.domain.model.Customer;
import com.example.orderflow.domain.port.CustomerRepositoryPort;
import com.example.orderflow.dto.request.CustomerRequest;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CreateCustomerUseCaseImpl 
        implements CreateCustomerUseCase {

    private final CustomerRepositoryPort repositoryPort;

    @Override
    @Transactional
    public Customer execute(CustomerRequest request) {

        Customer customer = new Customer();
        
        customer.setName(request.getName());
        customer.setEmail(request.getEmail());
        customer.setPhone(request.getPhone());
        
        return repositoryPort.save(customer);
    }

}
