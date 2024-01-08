package com.dobraccon.painmarket.repository;

import com.dobraccon.painmarket.product.Product;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class ProductRepository {
    JdbcTemplate jdbcTemplate;

    public void saveProduct(Product product) {
        String sql = String.format(
                "INSERT INTO product(id, name, price, discount) " +
                        "VALUES(nextval('product_sequence'), '%s', '%s', '%s');",
                product.getName(),
                product.getPrice(),
                product.getDiscount());
        jdbcTemplate.execute(sql);
    }
}
