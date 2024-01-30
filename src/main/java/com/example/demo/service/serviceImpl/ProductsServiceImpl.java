package com.example.demo.service.serviceImpl;

import com.example.demo.model.Products;
import com.example.demo.repository.ProductsRepository;
import com.example.demo.service.ProductsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ProductsServiceImpl implements ProductsService {
    private final ProductsRepository productsRepository;

    @Override
    public List<Products> getAll() {
        return productsRepository.findAll();
    }
}
