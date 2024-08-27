package com.capitalone.service;
import com.capitalone.model.Card;
import java.util.List;
public interface CardService {
	    Card createCard(Card card);
	    Card getCardByNumber(Long cardNumber);
	    void blockCard(Long cardNumber);
	}

