package com.dobraccon.painmarket.service;

import com.dobraccon.painmarket.product.Product;
import com.dobraccon.painmarket.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductService {
    private final ProductRepository repository;

    public Product saveProduct(Product product) {
        return repository.saveProduct(product);
    }
}
