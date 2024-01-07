package com.dobraccon.painmarket.product;

import lombok.Getter;

@Getter
public class Customer {
    private final long id;
    private final String email;

    public Customer(long id, String email) {
        this.id = id;
        this.email = email;
    }
}
