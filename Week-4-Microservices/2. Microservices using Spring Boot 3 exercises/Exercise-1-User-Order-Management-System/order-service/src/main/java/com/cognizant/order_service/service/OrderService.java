package com.cognizant.order_service.service;

import com.cognizant.order_service.client.UserClient;
import com.cognizant.order_service.dto.UserDTO;
import com.cognizant.order_service.model.Order;
import com.cognizant.order_service.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository repository;
    private final UserClient userClient;

    public OrderService(OrderRepository repository,
                        UserClient userClient) {
        this.repository = repository;
        this.userClient = userClient;
    }

    public Order save(Order order) {
        return repository.save(order);
    }

    public List<Order> getAllOrders() {
        return repository.findAll();
    }

    public UserDTO getUser(Long id) {
        return userClient.getUser(id);
    }
}