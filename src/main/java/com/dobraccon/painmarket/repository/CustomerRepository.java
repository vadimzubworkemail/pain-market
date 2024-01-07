package com.dobraccon.painmarket.repository;

import com.dobraccon.painmarket.product.Customer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
@AllArgsConstructor
public class CustomerRepository {
//    private final List<Customer> customers = new ArrayList<>();

    public Customer saveCustomer(Customer customer) {
        Customer newCustomer = new Customer(
                new Random().nextLong(), customer.getEmail()
        );
//                customers.add(newCustomer);
                return newCustomer;
    }
}
