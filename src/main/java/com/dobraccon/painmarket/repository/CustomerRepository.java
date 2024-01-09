package com.dobraccon.painmarket.repository;

import com.dobraccon.painmarket.product.Customer;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class CustomerRepository {
    private JdbcTemplate jdbcTemplate;


    public void saveCustomer(Customer customer) {
        String sql = String.format(
                "INSERT INTO customer(id, email) VALUES(nextval('customer_sequence'), '%s');"
                , customer.getEmail());
        jdbcTemplate.execute(sql);
    }
}
