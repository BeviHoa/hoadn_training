package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Embeddable
public class OrderItem {
    @JsonProperty("product_id")
    private long productId;

    private double price;

    private int quantity;

    public OrderItem() {
    }

    public OrderItem(long productId, double price, int quantity) {
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
    }
}
