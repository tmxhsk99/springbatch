package com.kjh.springbatch.testdomain.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
public class TbTest {

    private Long id;
    private String name;
    private String description;
    private int amount;
    private int price;

    @Builder
    public TbTest(String name, String description, int amount, int price) {
        this.name = name;
        this.description = description;
        this.amount = amount;
        this.price = price;
    }
}
