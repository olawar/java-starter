package agh.mwo.java1_3.businessCards;

import java.util.ArrayList;

public class BankAccountBusinessCard extends BusinessCard {

	private String bankAccount;

	public BankAccountBusinessCard(String name, String surname, int phone, String city, String bankAccount) {
		super(name, surname, phone, city);
		this.bankAccount = bankAccount;
	}

	public String getBankAccount() {
		return this.bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	protected ArrayList<String> getLines() {
		ArrayList<String> lines = super.getLines();
		lines.add(this.bankAccount);
		return lines;
	}
}
