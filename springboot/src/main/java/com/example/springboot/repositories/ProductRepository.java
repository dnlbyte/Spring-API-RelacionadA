package com.example.springboot.repositories;

import com.example.springboot.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository //notação para declarar que essa interface se trata de um repositório
public interface ProductRepository extends JpaRepository<ProductModel, UUID> { // implementando a persistência de dados com o jpa, e falando qual classe será usada de modelo e o tipo de dado

}
