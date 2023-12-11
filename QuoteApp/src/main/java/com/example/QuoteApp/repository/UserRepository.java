package com.example.QuoteApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.QuoteApp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // You can define custom methods here if needed
}
