package com.example.ecommerce.ecommerce_api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.ecommerce_api.Repository.OrderItemRepository;
import com.example.ecommerce.ecommerce_api.model.OrderItem;

@Service
public class OrderItemService {
    
     @Autowired
    private OrderItemRepository orderItemRepository;

    public List<OrderItem> getAllOrderItems() {
        return (List<OrderItem>) orderItemRepository.findAll();
    }

    public Optional<OrderItem> getOrderItemById(Long id) {
        Optional<OrderItem> orderItem=orderItemRepository.findById(id);
        return orderItem;
    }

    public OrderItem saveOrderItem(OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }

    public void deleteOrderItem(Long id) {
        orderItemRepository.deleteById(id);
    }
}
