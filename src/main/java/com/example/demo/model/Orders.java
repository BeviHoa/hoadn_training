package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Data
@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue
    private int id;

    private int user_id;

    private boolean status;
    @JdbcTypeCode(SqlTypes.JSON)
    private OrderData orderData;
}
