package com.capitalone.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//Author: Prasanna

@Entity
public class Card {

	@Id
	private Long cardNumber;
	private String cardName;
	private int cVV;
	private Date expireDate;
	private String cardType;

	public Card(Long cardNumber, String cardName, int cVV, Date expireDate, String cardType) {
		super();
		this.cardNumber = cardNumber;
		this.cardName = cardName;
		this.cVV = cVV;
		this.expireDate = expireDate;
		this.cardType = cardType;
	}

	public Card() {

	}
	public Long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public int getcVV() {
		return cVV;
	}
	public void setCVV(int cVV) {
		cVV = cVV;
	}
	public Date getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

}