package com.example.orderflow.application.usescase;

import com.example.orderflow.domain.model.Customer;
import com.example.orderflow.dto.request.CustomerRequest;

public interface CreateCustomerUseCase {
    Customer execute(CustomerRequest request);
}
