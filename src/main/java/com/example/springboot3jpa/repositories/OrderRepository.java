package com.example.springboot3jpa.repositories;

import com.example.springboot3jpa.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
