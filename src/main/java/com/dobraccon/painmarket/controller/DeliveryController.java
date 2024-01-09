package com.dobraccon.painmarket.controller;

import com.dobraccon.painmarket.model.Delivery;
import com.dobraccon.painmarket.service.DeliveryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/delivery")
public class DeliveryController {
    private DeliveryService service;

    @PostMapping
    public void createDelivery(@RequestBody Delivery delivery) {
        service.createDelivery(delivery);
    }
}
