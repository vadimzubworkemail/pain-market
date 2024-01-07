package com.dobraccon.painmarket.product;

import lombok.Getter;

@Getter
public class Product {
    private final Long id;
    private final String name;
    private final Float price;
    private final int discount;

    public Product(Long id, String name, Float price, int discount) {
        this.id = id;
        this.name = name;
        if (price <= 0) {
            throw new IllegalArgumentException("Price cannot be less than or equal to zero");
        }
        this.price = price;
        if ((discount > 100) || (discount < 0)) {
            throw new IllegalArgumentException("The discount cannot be less than 0% and no more than 100%");
        }
        this.discount = discount;
    }

//    public Float getADiscountPrice() {
//        return price - (price / 100 * discount);
//    }
}
