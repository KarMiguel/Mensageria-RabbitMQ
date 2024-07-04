package com.example.rabbitmq.domain.model;

import lombok.Data;

@Data
public class Order {

    private Long id;
    private String product;
    private Integer quantity;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", product='" + product + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
