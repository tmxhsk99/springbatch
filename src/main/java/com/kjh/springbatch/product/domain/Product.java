package com.kjh.springbatch.product.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Product {

    private Long id;
    private String name;
    private String imgUrl;
    private int price;

    @Builder
    public Product(String name, String imgUrl, int price) {
        this.name = name;
        this.imgUrl = imgUrl;
        this.price = price;
    }
}
