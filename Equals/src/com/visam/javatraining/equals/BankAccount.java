package com.visam.javatraining.equals;

public class BankAccount {
	
	int accountNumber;
	float accountBalance;
	boolean accountStatus;
	String name;
	
	
		public boolean equals(Object obj) {
		
		BankAccount bankaccount = (BankAccount) obj;
		if (name == null) {
			if (bankaccount.name != null)
				return false;
		} else if (!name.equals(bankaccount.name))
			return false;
		return true;
		
	}
	

	public boolean status(BankAccount account) {
		
		if(accountStatus!=account.accountStatus) {
			return false;
		}
		return true;
	}

}
