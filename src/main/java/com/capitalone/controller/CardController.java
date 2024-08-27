package com.capitalone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.capitalone.model.Card;
import com.capitalone.service.CardService;
import java.util.List;

@RestController
@RequestMapping("/api/cards")
public class CardController {

    @Autowired
    private CardService CardService;  // CardService is where business logic is handled

    // 1. Create a new card
    @PostMapping("/create")
    public ResponseEntity<Card> createCard(@RequestBody Card card) {
        Card createdCard = CardService.createCard(card);
        return new ResponseEntity<>(createdCard, HttpStatus.CREATED);
    }

    // 2. Get card details by card number
    @GetMapping("/{cardNumber}")
    public ResponseEntity<Card> getCardByNumber(@PathVariable Long cardNumber) {
        Card card = CardService.getCardByNumber(cardNumber);
        return new ResponseEntity<>(card, HttpStatus.OK);
    }

    // 3. Block a card
    @PutMapping("/block/{cardNumber}")
    public ResponseEntity<String> blockCard(@PathVariable Long cardNumber) {
        CardService.blockCard(cardNumber);
        return new ResponseEntity<>("Card blocked successfully", HttpStatus.OK);
    }

    // 4. Get all cards for an account
//    @GetMapping("/account/{accountId}")
//    public ResponseEntity<List<Card>> getAllCardsByAccount(@PathVariable Long accountId) {
//        List<Card> cards = CardService.getAllCardsByAccountId(accountId);
//        return new ResponseEntity<>(cards, HttpStatus.OK);
//    }
}

