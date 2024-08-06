package com.example.ecommerce.ecommerce_api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.ecommerce_api.Repository.CartItemRepository;
import com.example.ecommerce.ecommerce_api.model.CartItem;
 
@Service
public class CartItemService {

    @Autowired
    CartItemRepository cartItemRepository;

     public List<CartItem> getAllCartItems(){
        return (List<CartItem>) cartItemRepository.findAll(); 
    }

    public Optional<CartItem> getAllCartItemsById(Long id){
        Optional<CartItem> cartItem=cartItemRepository.findById(id);
        return cartItem;
    }
    
    public CartItem saveCustomer(CartItem cartItem){
        CartItem crt =cartItemRepository.save(cartItem);
       return crt;
    }

    public void deleteCustomer(Long id) {
        cartItemRepository.deleteById(id);
    }
}
