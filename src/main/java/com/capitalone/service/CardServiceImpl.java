package com.capitalone.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capitalone.model.Card;
import com.capitalone.repository.CardRepository;

import java.util.List;

@Service
public class CardServiceImpl implements CardService{

    @Autowired
    private CardRepository CardRepository; // This assumes you have a CardRepository that extends JpaRepository

    public Card createCard(Card card) {
        return CardRepository.save(card);
    }

    public Card getCardByNumber(Long cardNumber) {
        return CardRepository.findById(cardNumber)
               .orElseThrow(() -> new RuntimeException("Card not found"));
    }

    public void blockCard(Long cardNumber) {
        Card card = CardRepository.findById(cardNumber)
                     .orElseThrow(() -> new RuntimeException("Card not found"));
        card.setCardType("blocked"); // Example of blocking logic
        CardRepository.save(card);
    }

//    public List<Card> getAllCardsByAccountId(Long cardNumber) {
//        return CardRepository.findByCardNumber(cardNumber); // Assuming you have a method in repository
//    }
}
