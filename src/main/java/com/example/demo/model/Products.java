package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    private  String image;

    private float price;

    public Products() {
    }

    public Products(int id, String name, String image, float price) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
    }

}
