package com.example.springboot.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name = "TB_PERSON")
public class PersonModel {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name", length = 100, nullable = false)
    private String name;


    @Column(name = "cpf", length = 11, nullable = false, unique = true)
    private String cpf;

    @Column(name = "isActive", nullable = false)
    private Boolean isActive;

    @OneToOne(mappedBy = "person")
    private UserModel user;
}
