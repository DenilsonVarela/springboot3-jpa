package com.example.springboot3jpa.repositories;

import com.example.springboot3jpa.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
