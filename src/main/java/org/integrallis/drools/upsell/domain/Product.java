package org.integrallis.drools.upsell.domain;

public enum Product {
	CHECKING_ACCOUNT("Checking Account"), 
	SAVINGS_ACCOUNT("Savings Account"),
	OVERDRAFT_PROTECTION("Overdraft Protection"),
	CD_25("CD with 25 basis point increase"),
	CD_50("CD with 50 basis point increase"),
	MONEY_MARKET_MUTUAL_FUND("Money Market Mutual Fund"),
	CREDIT_CARD("Credit Card"),
	CREDIT_CARD_NO_FEE("Credit Card with no annual fee"),
	WEB_BANKING("Web Banking"),
	WEB_BANKING_NO_CHARGE("Web Banking with no charge"),
	DEBIT_ATM_CARD("Debit/ATM Card"),
	BROKERAGE_ACCOUNT("Brokerage Account"),
	MORTAGAGE_LOAN("Mortgage Loan"),
	CAR_LOAN("Car Loan");
	
	private Product(String name) { this.name = name; }
	private String name;
	public String toString() { return name; }
}
