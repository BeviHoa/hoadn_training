package com.example.demo.service;

import com.example.demo.model.CartItems;
import com.example.demo.repository.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface CartItemService {
    CartItems addCartItem(CartItems cartItems);

}
