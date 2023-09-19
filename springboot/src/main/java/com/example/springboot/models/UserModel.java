package com.example.springboot.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Data
@Table(name = "TB_USER")

public class UserModel {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "email", length = 200, nullable = false)
    private String email;

    @Column(name = "password", length = 128, nullable = false)
    private String password;

    @Column(name = "isActive", nullable = false)
    private Boolean isActive;

    @OneToOne
    @JoinColumn(name = "id_person")
    private PersonModel  person;



    @ManyToMany
    @JoinTable(name = "USER_ROLE", joinColumns = @JoinColumn(name = "id_user"), inverseJoinColumns = @JoinColumn(name ="id_role"))
    private Set<Role> roles = new HashSet<>();


}
