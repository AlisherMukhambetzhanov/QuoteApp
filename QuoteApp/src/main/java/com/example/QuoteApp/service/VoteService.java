package com.example.QuoteApp.service;

import com.example.QuoteApp.model.VoteType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.QuoteApp.model.Vote;
import com.example.QuoteApp.repository.VoteRepository;

import java.util.List;

@Service
public class VoteService {
    private final VoteRepository voteRepository;

    @Autowired
    public VoteService(VoteRepository voteRepository) {
        this.voteRepository = voteRepository;
    }

    public Vote createVote(Vote vote) {
        // Add your business logic here
        return voteRepository.save(vote);
    }

    public Vote getVote(Long id) {
        return voteRepository.findById(id).orElse(null);
    }

    public List<Vote> getAllVotes() {
        return voteRepository.findAll();
    }

    public Long getScoreForQuote(Long quoteId) {
        Long upvotes = voteRepository.countByQuoteIdAndType(quoteId, VoteType.UPVOTE);
        Long downvotes = voteRepository.countByQuoteIdAndType(quoteId, VoteType.DOWNVOTE);
        return upvotes - downvotes;
    }

}
