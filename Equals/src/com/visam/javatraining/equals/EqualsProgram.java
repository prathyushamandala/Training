package com.visam.javatraining.equals;


public class EqualsProgram {

	public static void main(String[] args) {

		BankAccount account1  = new BankAccount();
		BankAccount account2  = new BankAccount();
		
		account1.name = "prathyusha";
		account2.name = "prathyusha";
		
		
		
		account1.accountStatus = true;
		account2.accountStatus = true;
		
		
		 account1.status(account2);
		
		
		if(account1.equals(account2)) {
			System.out.println("Bank accounts are same ");
		}else {
			System.out.println("Bank accounts are different ");
		}
	}

}


