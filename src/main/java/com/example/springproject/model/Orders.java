package com.example.springproject.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Data;

//class named Order will be mapped to a table named Order.
@Entity
@Data
@Table(name = "Orders")
public class Orders {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private int quantity;
    private String customerEmail;
    private double price;
    private LocalDateTime orderDate = LocalDateTime.now();
    @Version
    private Integer version;


}
