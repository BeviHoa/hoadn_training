package com.example.demo.controller;

import com.example.demo.model.CartItems;
import com.example.demo.repository.CartItemRepository;
import com.example.demo.service.CartItemService;
import com.example.demo.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/cart_items")
public class CartItemController {
    private final CartItemService cartItemService;

    @Autowired
    public CartItemController(CartItemService cartItemService) {
        this.cartItemService = cartItemService;
    }
    @PostMapping
    public ResponseEntity<CartItems> addCartItem(@RequestBody CartItems cartItems) {
        try {
            CartItems addedCartItem = cartItemService.addCartItem(cartItems);
            return new ResponseEntity<>(addedCartItem, HttpStatus.CREATED);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
