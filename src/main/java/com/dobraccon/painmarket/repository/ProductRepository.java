package com.dobraccon.painmarket.repository;

import com.dobraccon.painmarket.model.Product;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class ProductRepository {
    private JdbcTemplate jdbcTemplate;

    public void saveProduct(Product product) {
        String sql = String.format(
                "INSERT INTO products(id, name, price, discount) " +
                        "VALUES(nextval('products_sequence'), '%s', '%s', '%s');",
                product.getName(),
                product.getPrice(),
                product.getDiscount());
        jdbcTemplate.execute(sql);
    }
}
