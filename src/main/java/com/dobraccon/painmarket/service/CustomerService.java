package com.dobraccon.painmarket.service;

import com.dobraccon.painmarket.product.Customer;
import com.dobraccon.painmarket.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerRepository repository;

    public void saveCustomer(Customer customer) {
        repository.saveCustomer(customer);
    }
}
