package com.Danielsilvadelima.CrudProduto.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import lombok.Data;

@Entity
@Data
@Table(name= "TB_PRODUTO")
public class ProductModel {
    // MODELAGEM DO BANCO DE DADOS
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name ="name", length = 100, nullable = false, unique = true) 
    private  String name;
    
    @Column(name = "unitPrice", nullable = false, precision = 10, scale = 2)
    private BigDecimal unitPrice;
    
    @Column(name ="stockQuantity", length = 6, nullable = false)
    private Integer stockQuantity;
    
    @Column(name = "isActive", nullable = false)
    private Boolean isActive;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private PersonModel person;
  
}
