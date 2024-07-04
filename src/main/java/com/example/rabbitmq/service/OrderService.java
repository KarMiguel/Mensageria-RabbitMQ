package com.example.rabbitmq.service;


import com.example.rabbitmq.domain.dtos.OrderDTO;
import com.example.rabbitmq.domain.model.Order;
import com.example.rabbitmq.sender.OrderMessageSender;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderMessageSender orderMessageSender;


    public void processOrder(OrderDTO orderDTO) {
        Order order = new Order();
        order.setId(orderDTO.getId());
        order.setProduct(orderDTO.getProduct());
        order.setQuantity(orderDTO.getQuantity());

        orderMessageSender.sendOrder(order);
    }
}
