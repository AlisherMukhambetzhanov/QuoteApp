package com.example.QuoteApp.repository;

import com.example.QuoteApp.model.VoteType;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.QuoteApp.model.Vote;

public interface VoteRepository extends JpaRepository<Vote, Long> {
    Long countByQuoteIdAndType(Long quoteId, VoteType voteType);
    // You can define custom methods here if needed
}
