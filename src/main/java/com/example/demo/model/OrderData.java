package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Embeddable
public class OrderData {
    @JsonProperty("total_amount")
    private double totalAmount;

    private double discount;

    //private List<OrderItem> items;

    public OrderData() {
    }

    public OrderData(double totalAmount, double discount) {
        this.totalAmount = totalAmount;
        this.discount = discount;
    }
}
