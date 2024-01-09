package com.dobraccon.painmarket.repository;

import com.dobraccon.painmarket.model.Delivery;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class DeliveryRepository {
    private JdbcTemplate jdbcTemplate;

    public void createDelivery(Delivery delivery) {
        String sql = String.format(
                "INSERT INTO delivery(id, order_id, customer_id, address) " +
                        "VALUES(nextval('delivery_sequence'), '%s', '%s', '%s');",
                delivery.getOrderId(),
                delivery.getCustomerId(),
                delivery.getAddress()
        );
        jdbcTemplate.execute(sql);
    }
}
