package com.example.demo.service;

import com.example.demo.model.Orders;
import org.hibernate.query.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    List<Orders> getAll();
}
