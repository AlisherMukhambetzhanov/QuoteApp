package com.example.QuoteApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.QuoteApp.model.Quote;
import com.example.QuoteApp.service.QuoteService;

import java.util.List;

@RestController
@RequestMapping("/quotes")
public class QuoteController {
    private final QuoteService quoteService;

    @Autowired
    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @PostMapping
    public Quote createQuote(@RequestBody Quote quote) {
        return quoteService.createQuote(quote);
    }

    @GetMapping("/{id}")
    public Quote getQuote(@PathVariable Long id) {
        return quoteService.getQuote(id);
    }

    @GetMapping
    public List<Quote> getAllQuotes() {
        return quoteService.getAllQuotes();
    }

    @GetMapping("/random")
    public Quote getRandomQuote() {
        return quoteService.getRandomQuote();
    }

    @PutMapping("/{id}")
    public Quote updateQuote(@PathVariable Long id, @RequestBody Quote newQuote) {
        return quoteService.updateQuote(id, newQuote);
    }

    @DeleteMapping("/{id}")
    public void deleteQuote(@PathVariable Long id) {
        quoteService.deleteQuote(id);
    }

    @GetMapping("/top10")
    public List<Quote> getTop10Quotes() {
        return quoteService.getTop10Quotes();
    }

    @GetMapping("/worst10")
    public List<Quote> getWorst10Quotes() {
        return quoteService.getWorst10Quotes();
    }
}
