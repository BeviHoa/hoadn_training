package com.example.demo.service;

import com.example.demo.model.Products;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductsService {
    List<Products> getAll();
}
