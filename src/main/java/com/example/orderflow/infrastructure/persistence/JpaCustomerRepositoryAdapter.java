package com.example.orderflow.infrastructure.persistence;

import org.springframework.stereotype.Repository;

import com.example.orderflow.domain.model.Customer;
import com.example.orderflow.domain.port.CustomerRepositoryPort;

import lombok.RequiredArgsConstructor;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class JpaCustomerRepositoryAdapter 
        implements CustomerRepositoryPort {

    private final JpaCustomerRepository repository;

    @Override
    public Customer save(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return repository.findById(id);
    }
    
}
