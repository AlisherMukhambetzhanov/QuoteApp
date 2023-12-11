package com.example.QuoteApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.QuoteApp.model.Quote;

public interface QuoteRepository extends JpaRepository<Quote, Long> {
    // You can define custom methods here if needed
}
