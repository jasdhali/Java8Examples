package com.practice.domain;

public class Transaction {
	private Currency currency;
	private Float price;

	public Transaction(Currency currency) {
		super();
		this.currency = currency;
	}
	

	public Transaction(Currency currency, Float price) {
		super();
		this.currency = currency;
		this.price = price;
	}


	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}
	
}
