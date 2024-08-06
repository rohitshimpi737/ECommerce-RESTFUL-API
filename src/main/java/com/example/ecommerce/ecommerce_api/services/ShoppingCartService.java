package com.example.ecommerce.ecommerce_api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.ecommerce_api.Repository.ShoppingCartRepository;
import com.example.ecommerce.ecommerce_api.model.ShoppingCart;

@Service
public class ShoppingCartService {
    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    public List<ShoppingCart> getAllShoppingCarts() {
        return (List<ShoppingCart>) shoppingCartRepository.findAll();
    }

    public Optional<ShoppingCart> getShoppingCartById(Long id) {
        return shoppingCartRepository.findById(id);
    }

    public ShoppingCart saveShoppingCart(ShoppingCart shoppingCart) {
        return shoppingCartRepository.save(shoppingCart);
    }

    public void deleteShoppingCart(Long id) {
        shoppingCartRepository.deleteById(id);
    }
}
