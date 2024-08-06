package com.example.ecommerce.ecommerce_api.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ecommerce.ecommerce_api.model.CartItem;

@Repository
public interface CartItemRepository extends  CrudRepository<CartItem,Long> {
    
}
