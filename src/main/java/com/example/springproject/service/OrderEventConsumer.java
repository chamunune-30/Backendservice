package com.example.springproject.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderEventConsumer {

    @KafkaListener(topics="orders", groupId = "order-consumer-group")
    public void consumeOrderEvent(String message){
        System.out.println("Received Order Event:" +message);

    }

}
