package com.example.QuoteApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.QuoteApp.model.Quote;
import com.example.QuoteApp.repository.QuoteRepository;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class QuoteService {
    private final QuoteRepository quoteRepository;
    private final VoteService voteService;

    @Autowired
    public QuoteService(QuoteRepository quoteRepository, VoteService voteService) {
        this.quoteRepository = quoteRepository;
        this.voteService = voteService;
    }

    public Quote createQuote(Quote quote) {
        // Add your business logic here
        return quoteRepository.save(quote);
    }

    public Quote getQuote(Long id) {
        return quoteRepository.findById(id).orElse(null);
    }

    public List<Quote> getAllQuotes() {
        return quoteRepository.findAll();
    }

    public Quote getRandomQuote() {
        List<Quote> quotes = getAllQuotes();
        return quotes.get(new Random().nextInt(quotes.size()));
    }

    public Quote updateQuote(Long id, Quote newQuote) {
        return quoteRepository.findById(id)
                .map(quote -> {
                    quote.setContent(newQuote.getContent());
                    return quoteRepository.save(quote);
                })
                .orElseGet(() -> {
                    newQuote.setId(id);
                    return quoteRepository.save(newQuote);
                });
    }

    public void deleteQuote(Long id) {
        quoteRepository.deleteById(id);
    }

    public List<Quote> getTop10Quotes() {
        return quoteRepository.findAll().stream()
                .sorted((q1, q2) -> Long.compare(voteService.getScoreForQuote(q2.getId()), voteService.getScoreForQuote(q1.getId())))
                .limit(10)
                .collect(Collectors.toList());
    }

    public List<Quote> getWorst10Quotes() {
        return quoteRepository.findAll().stream()
                .sorted((q1, q2) -> Long.compare(voteService.getScoreForQuote(q1.getId()), voteService.getScoreForQuote(q2.getId())))
                .limit(10)
                .collect(Collectors.toList());
    }
}