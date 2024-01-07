package com.dobraccon.painmarket.repository;

import com.dobraccon.painmarket.product.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
@AllArgsConstructor
public class ProductRepository {
//    private List<Product> productList = new ArrayList<>();

    public Product saveProduct(Product product) {
        Product newProduct = new Product(
                new Random().nextLong(), product.getName(), product.getPrice(), product.getDiscount());
//        productList.add(newProduct);
        return newProduct;
    }
}
