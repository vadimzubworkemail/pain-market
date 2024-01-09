package com.dobraccon.painmarket.controller;

import com.dobraccon.painmarket.product.Product;
import com.dobraccon.painmarket.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {
    private final ProductService service;

    @PostMapping
    public void saveProduct(@RequestBody Product product) {
        service.saveProduct(product);
    }
}
