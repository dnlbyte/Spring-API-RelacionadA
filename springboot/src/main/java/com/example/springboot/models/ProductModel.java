package com.example.springboot.models;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Data
@Table(name = "TB_PRODUCT")
public class ProductModel {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name", length = 100, nullable = false, unique = true)
    private String name;


    @Column(name = "description", length = 200, nullable = false)
    private String description;

    @Column(name = "unitprice", nullable = false, precision = 10, scale = 2)
    private BigDecimal unitPrice;

    @Column(name = "quantity", length = 6, nullable = false)
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "id_person")
    private PersonModel  person;
}
