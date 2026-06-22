package com.example.orders_backend.service;

import com.example.orders_backend.dto.request.CustomerRequest;
import com.example.orders_backend.entity.Customer;

public interface CustomerService {
    Customer createCustomer(CustomerRequest request);
}
