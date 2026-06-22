package com.example.orders_backend.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.orders_backend.dto.request.CustomerRequest;
import com.example.orders_backend.entity.Customer;
import com.example.orders_backend.repository.CustomerRepository;
import com.example.orders_backend.service.CustomerService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    @Transactional
    public Customer createCustomer(CustomerRequest request) {

        Customer customer = new Customer();
        customer.setName(request.getName());
        customer.setEmail(request.getEmail());
        customer.setPhone(request.getPhone());
        
        return customerRepository.save(customer);
    }

}
