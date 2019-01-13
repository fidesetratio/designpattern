package org.learning.creation.builder;

public class BankAccount {

		private String name;
		private String accountName;
		private String email;
		private boolean newsletter;
		
		
		private BankAccount(BankAccountBuilder bankAccountBuilder) {
			this.accountName = bankAccountBuilder.accountNumber;
			this.name = bankAccountBuilder.name;
			this.email = bankAccountBuilder.email;
			this.newsletter = bankAccountBuilder.newsletter;
		}
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAccountName() {
			return accountName;
		}
		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public boolean isNewsletter() {
			return newsletter;
		}
		public void setNewsletter(boolean newsletter) {
			this.newsletter = newsletter;
		}
	
		
		
		public static class BankAccountBuilder{
				
				private String name;
				private String accountNumber;
				private String email;
				private boolean newsletter;
				
				public BankAccountBuilder(String name,String accountNumber) {
						this.name = name;
						this.accountNumber = accountNumber;
				}
				
				public BankAccountBuilder withEmail(String email) {
					this.email = email;
					return this;
				}
				
				public BankAccountBuilder wantsNewsletter (boolean newsletter) {
					this.newsletter = newsletter;
					return this;
				}
				
				public BankAccount build() {
					return new BankAccount(this);
				}
			
			
		}
		
}
