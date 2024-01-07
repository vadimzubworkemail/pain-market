package com.dobraccon.painmarket.repository;

import com.dobraccon.painmarket.product.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Random;

@Repository
@AllArgsConstructor
public class ProductRepository {

    public Product saveProduct(Product product) {
        return new Product(
                new Random().nextLong(), product.getName(), product.getPrice(), product.getDiscount());
    }
}
