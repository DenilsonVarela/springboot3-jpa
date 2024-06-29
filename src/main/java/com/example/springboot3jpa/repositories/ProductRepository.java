package com.example.springboot3jpa.repositories;

import com.example.springboot3jpa.entities.Category;
import com.example.springboot3jpa.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
