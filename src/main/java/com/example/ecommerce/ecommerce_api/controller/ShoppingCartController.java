package com.example.ecommerce.ecommerce_api.controller;
  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.ecommerce.ecommerce_api.model.ShoppingCart;
import com.example.ecommerce.ecommerce_api.services.ShoppingCartService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ShoppingCartController {

    @Autowired
    private ShoppingCartService shoppingCartService;

    @GetMapping("/shopping-carts")
    public ResponseEntity<List<ShoppingCart>> getAllShoppingCarts() {
        return ResponseEntity.ok(shoppingCartService.getAllShoppingCarts());
    }

    @GetMapping("/shopping-carts/{id}")
    public ResponseEntity<Optional<ShoppingCart>> getShoppingCartById(@PathVariable Long id) {
        return ResponseEntity.ok(shoppingCartService.getShoppingCartById(id));
    }

    @PostMapping("/shopping-carts")
    public ResponseEntity<ShoppingCart> createShoppingCart(@RequestBody ShoppingCart shoppingCart) {
        return ResponseEntity.ok(shoppingCartService.saveShoppingCart(shoppingCart));
    }

    @PutMapping("/shopping-carts/{id}")
    public ResponseEntity<ShoppingCart> updateShoppingCart(@PathVariable Long id, @RequestBody ShoppingCart shoppingCart) {
        shoppingCart.setId(id);
        return ResponseEntity.ok(shoppingCartService.saveShoppingCart(shoppingCart));
    }

    @DeleteMapping("/shopping-carts/{id}")
    public ResponseEntity<Void> deleteShoppingCart(@PathVariable Long id) {
        shoppingCartService.deleteShoppingCart(id);
        return ResponseEntity.noContent().build();
    }
}

