package com.dobraccon.painmarket.repository;

import com.dobraccon.painmarket.product.Order;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class OrderRepository {
    JdbcTemplate jdbcTemplate;

    public void createOrder(Order order) {
        String sql = String.format(
                "INSERT INTO orders(id, product_id, client_id, price) " +
                        "VALUES(nextval('orders_sequence'), '%s', '%s', '%s');",
                order.getProductId(),
                order.getClientId(),
                order.getPrice()
        );
        jdbcTemplate.execute(sql);
    }
}
