package com.example.springboot.models;

import jakarta.persistence.*;
import lombok.Data;


import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Data
@Table(name = "TB_ROLE")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "isActive", nullable = false)
    private Boolean isActive;

    @ManyToMany(mappedBy = "roles")
    private Set<UserModel> users = new HashSet<>();
}
