package com.visam.javatraining.equalshashcode;

public class BankAccount {
	
	int accountNumber;
	float accountBalance;
	boolean accountStatus;
	String name;
	
	
		public boolean equals(Object obj) {
		
		BankAccount bankaccount = (BankAccount) obj;
	
		if(bankaccount == null) {
			return false;
		}
		if(!(bankaccount instanceof BankAccount)){
			return false;
		}
		
		if (name!=(bankaccount.name)) {
			return false;
		}
			
		if(accountStatus!=bankaccount.accountStatus) {
			return false;
		}
		if (accountBalance!=bankaccount.accountBalance)
		{
			return false;
		}
		if (accountNumber!=bankaccount.accountNumber) {

		}
		return true;
		}
		@Override
		public int hashCode() {
			
			int result;
			result = Boolean.hashCode(accountStatus);
		      
			int result1;
			result1 =Float.hashCode(accountBalance);
			
			int result2;
			result2 = (name==null) ? 0 : (name.hashCode());
			
			int result3;
			result3 = Integer.valueOf(accountNumber).hashCode();
					
			int res= result+result1+result2+result3;
				return res;
		}
	
		
		public int getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
	
}


