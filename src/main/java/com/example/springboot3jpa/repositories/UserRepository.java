package com.example.springboot3jpa.repositories;

import com.example.springboot3jpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
