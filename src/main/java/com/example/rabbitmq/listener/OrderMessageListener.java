package com.example.rabbitmq.listener;


import com.example.rabbitmq.domain.model.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderMessageListener {

    public void receiveMessage(Order order) {
        System.out.println("Received order: " + order);
    }
}
