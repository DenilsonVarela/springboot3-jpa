package com.example.springboot3jpa.repositories;

import com.example.springboot3jpa.entities.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
