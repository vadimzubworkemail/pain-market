package com.dobraccon.painmarket.controller;

import com.dobraccon.painmarket.product.Customer;
import com.dobraccon.painmarket.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService service;

    @PostMapping
    public Customer saveCustomer(@RequestBody Customer customer) {
        return  service.saveCustomer(customer);
    }
}
