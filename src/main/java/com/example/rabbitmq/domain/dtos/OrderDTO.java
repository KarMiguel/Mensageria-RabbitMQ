package com.example.rabbitmq.domain.dtos;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Data
public class OrderDTO {

    @NotNull
    private Long id;

    @NotNull
    @Size(min = 2, max = 100)
    private String product;

    @NotNull
    private Integer quantity;
}
