package com.example.springproject.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springproject.model.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long> {
    
    // Custom method to find orders by customer email
    //Spring Data JPA will automatically generate a query like: SELECT * FROM order WHERE customer_email = ?
    List<Orders> findByCustomerEmail(String customerEmail);

}
