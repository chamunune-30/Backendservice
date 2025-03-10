package com.example.springproject.event;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderEventProducer {

    private static final String ORDERS_TOPIC = "orders";

    private final KafkaTemplate<String, String> kafkaTemplate;

    public OrderEventProducer(KafkaTemplate<String,String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendOrder(String message){
        kafkaTemplate.send(ORDERS_TOPIC, message);
        System.out.println("Message sent....");
    }

}
