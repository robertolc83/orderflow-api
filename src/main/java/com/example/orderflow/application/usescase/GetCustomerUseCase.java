package com.example.orderflow.application.usescase;

import com.example.orderflow.domain.model.Customer;

public interface GetCustomerUseCase {
    Customer execute(Long id);
}
