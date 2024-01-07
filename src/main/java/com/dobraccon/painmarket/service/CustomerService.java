package com.dobraccon.painmarket.service;

import com.dobraccon.painmarket.product.Customer;
import com.dobraccon.painmarket.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerRepository repository;

    public Customer saveCustomer(Customer customer) {
        return repository.saveCustomer(customer);
    }
}
