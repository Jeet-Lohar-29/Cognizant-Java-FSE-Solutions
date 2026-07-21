package com.cognizant.order_service.controller;

import com.cognizant.order_service.dto.UserDTO;
import com.cognizant.order_service.model.Order;
import com.cognizant.order_service.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping
    public Order save(@RequestBody Order order) {
        return service.save(order);
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return service.getAllOrders();
    }

    @GetMapping("/user/{id}")
    public UserDTO getUser(@PathVariable Long id) {
        return service.getUser(id);
    }
}