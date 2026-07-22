package com.example.orderflow.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.orderflow.domain.model.Customer;

public interface JpaCustomerRepository extends JpaRepository<Customer, Long> {

}
