package com.example.rabbitmq.controller;


import com.example.rabbitmq.domain.dtos.OrderDTO;
import com.example.rabbitmq.service.OrderService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/orders")
@Validated
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public ResponseEntity<String> createOrder(@Valid @RequestBody OrderDTO orderDTO) {
        orderService.processOrder(orderDTO);
        return ResponseEntity.ok("Order sent to processing queue");
    }
}
