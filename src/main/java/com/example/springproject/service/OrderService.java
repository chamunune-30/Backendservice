package com.example.springproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springproject.event.OrderEventProducer;
import com.example.springproject.model.Orders;
import com.example.springproject.repository.OrderRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderEventProducer orderEventProducer;

    @Autowired
    private ObjectMapper objectMapper;


    public Orders createOrder(Orders order){
        
        Orders savedOrder = orderRepository.save(order);
 
        try {
            String orderJson = objectMapper.writeValueAsString(savedOrder);
            System.out.println("order Json: " + orderJson);
            orderEventProducer.sendOrder(orderJson);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return savedOrder;
    }

    public List<Orders> getOrders(){
        return orderRepository.findAll();
    }

    public Optional<Orders> getOrderById(Long id){
        return orderRepository.findById(id);
    }

}
