package com.dobraccon.painmarket.controller;

import com.dobraccon.painmarket.product.Order;
import com.dobraccon.painmarket.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/orders")
public class OrderController {
    private OrderService service;

    @PostMapping
    public void createOrder(@RequestBody Order order) {
        service.createOrder(order);
    }
}
