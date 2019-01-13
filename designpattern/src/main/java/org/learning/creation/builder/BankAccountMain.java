package org.learning.creation.builder;

public class BankAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stubba
		
		BankAccount bankAccount = new BankAccount.
				BankAccountBuilder("patar timotius", "2020")
				.withEmail("patartimotiustambunan@gmail.com")
				.wantsNewsletter(true)
				.build();
		
		System.out.println(bankAccount.getAccountName());
		System.out.println(bankAccount.getEmail());

	}

}
