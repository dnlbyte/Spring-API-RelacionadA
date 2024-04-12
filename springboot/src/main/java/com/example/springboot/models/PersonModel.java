package com.Danielsilvadelima.CrudProduto.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Data
@Table(name="TB_PERSON")
public class PersonModel {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private UUID id;

    @Column(name = "name", nullable = false, unique = false)
    private String name;

    @Column(name = "cpf", nullable = false, unique = true)
    private String cpf;

    @Column(name = "isActive", nullable = false)
    private Boolean isActive;

    @OneToMany(mappedBy = "person")
    private Set<ProductModel> products = new HashSet<>();
}
