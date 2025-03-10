package com.example.springproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springproject.model.Employee;
import com.example.springproject.model.Orders;
import com.example.springproject.repository.EmployeeRepository;
import com.example.springproject.service.OrderService;


@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private OrderService orderService;

    @GetMapping("/employee")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @PostMapping("/addemployee")
    public Employee addEmployee(@RequestBody Employee employee){
            return employeeRepository.save(employee);
    }

    @PostMapping("/orders")
    public Orders placeOrder(@RequestBody Orders order)
    {
        return orderService.createOrder(order);
    }
    
    // @GetMapping("/")
    // public List<Order> getList(){

    // }

    
}
