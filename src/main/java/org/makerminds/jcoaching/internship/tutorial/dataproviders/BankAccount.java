package org.makerminds.jcoaching.internship.tutorial.dataproviders;

public class BankAccount {
	
	private int accountNumber;
	private BankAccountOwner bankAccountOwner;
	
	public BankAccount(int accountNumber, BankAccountOwner bankAccountOwner) {
		this.accountNumber = accountNumber;
		this.bankAccountOwner = bankAccountOwner;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public BankAccountOwner getBankAccountOwner() {
		return bankAccountOwner;
	}
	public void setBankAccountOwner(BankAccountOwner bankAccountOwner) {
		this.bankAccountOwner = bankAccountOwner;
	}
}
