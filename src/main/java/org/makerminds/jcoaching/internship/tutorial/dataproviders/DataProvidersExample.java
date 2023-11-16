package org.makerminds.jcoaching.internship.tutorial.dataproviders;

/**
 * An example for using DataProviders using the bank app context.
 * 
 * @author makerminds
 *
 */
public class DataProvidersExample {

	public static void main(String[] args) {
		DataProvidersExample dataProvidersExample = new DataProvidersExample();
		dataProvidersExample.displayAllBankAccounts();
	}

	private void displayAllBankAccounts() {
		BankAccountsDataProvider bankAccountsDataProvider = new BankAccountsDataProvider();
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("-------------------- Bank Account List --------------------").append(System.lineSeparator());

		// collect all data from all available bank accounts provided
		for (BankAccount account : bankAccountsDataProvider.getBankAccounts()) {
			BankAccountOwner bankAccountOwner = account.getBankAccountOwner();
			stringBuilder.append("Bank account number: ").append(account.getAccountNumber())
					.append(System.lineSeparator());
			stringBuilder.append("Bank account owner: ").append(bankAccountOwner.getName()).append(", ")
					.append(bankAccountOwner.getAddress()).append(System.lineSeparator());
			stringBuilder.append("--------------------------------------------------------------------").append(System.lineSeparator());
		}
		
		// print the collected data
		System.out.println(stringBuilder);
	}
}
