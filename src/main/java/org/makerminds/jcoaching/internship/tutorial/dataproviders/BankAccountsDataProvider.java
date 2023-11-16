package org.makerminds.jcoaching.internship.tutorial.dataproviders;

import java.util.ArrayList;
import java.util.List;

public class BankAccountsDataProvider {

	private List<BankAccount> bankAccounts = new ArrayList<>();
	
	public BankAccountsDataProvider() {
		createBankAccounts();
	}

	private void createBankAccounts() {
		createBankAccount1();
		createBankAccount2();
		createBankAccount3();
		createBankAccount4();
	}

	private void createBankAccount1() {
		BankAccountOwner bankAccountOwner = new BankAccountOwner("John Doe", "Naheweg 55, 53111 Bonn");
		BankAccount bankAccount = new BankAccount(448855332, bankAccountOwner);
		bankAccounts.add(bankAccount);
	}
	
	private void createBankAccount2() {
		BankAccountOwner bankAccountOwner = new BankAccountOwner("Jane Doe", "Naheweg 55, 53111 Bonn");
		BankAccount bankAccount = new BankAccount(448866332, bankAccountOwner);
		bankAccounts.add(bankAccount);
	}
	
	private void createBankAccount3() {
		BankAccountOwner bankAccountOwner = new BankAccountOwner("Morgan Freeman", "Baselstrasse 14, 53227 Bonn");
		BankAccount bankAccount = new BankAccount(447755332, bankAccountOwner);
		bankAccounts.add(bankAccount);
	}
	
	private void createBankAccount4() {
		BankAccountOwner bankAccountOwner = new BankAccountOwner("Alan Parson", "Pecher Strasse 98, 53175 Bonn");
		BankAccount bankAccount = new BankAccount(448855882, bankAccountOwner);
		bankAccounts.add(bankAccount);
	}

	public List<BankAccount> getBankAccounts() {
		return bankAccounts;
	}
}
