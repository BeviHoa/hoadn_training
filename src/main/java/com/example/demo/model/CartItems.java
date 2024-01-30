package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.format.annotation.NumberFormat;

@Data
@Entity
@Table(name = "cart_items")
public class CartItems {
    @Id
    private int user_id;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products product;
    @Min(value = 1, message = "Quantity must have one products")
    private int quantity;

    public CartItems() {
    }

    public CartItems(int user_id, Products product, int quantity) {
        this.user_id = user_id;
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CartItems{" +
                "user_id=" + user_id +
                ", product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
