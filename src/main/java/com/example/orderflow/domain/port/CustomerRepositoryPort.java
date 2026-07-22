package com.example.orderflow.domain.port;

import java.util.Optional;

import com.example.orderflow.domain.model.Customer;

public interface CustomerRepositoryPort {

    Customer save(Customer customer);

    Optional<Customer> findById(Long id);

}
