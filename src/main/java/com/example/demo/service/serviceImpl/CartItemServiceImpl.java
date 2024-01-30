package com.example.demo.service.serviceImpl;

import com.example.demo.model.CartItems;
import com.example.demo.model.Products;
import com.example.demo.repository.CartItemRepository;
import com.example.demo.repository.ProductsRepository;
import com.example.demo.service.CartItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartItemServiceImpl implements CartItemService {
    private final CartItemRepository cartItemRepository;
    @Transactional
    @Override
    public CartItems addCartItem(CartItems cartItems) {
        if (cartItems == null) {
            throw new IllegalArgumentException("CartItems cannot be null");
        }
        try {
            return cartItemRepository.save(cartItems);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add cart item", e);
        }
    }
}
