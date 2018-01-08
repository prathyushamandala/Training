package com.visam.javatraining.equalshashcode;


public class EqualsProgram {

	public static void main(String[] args) {

		BankAccount account1  = new BankAccount();
		BankAccount account2  = new BankAccount();
		
		account1.name = "prathyusha";
		account2.name = "prathyusha";
		
		
		
		account1.accountStatus = true;
		account2.accountStatus = true;
		
		account1.accountBalance = 101F;
		account2.accountBalance = 101F;
		
		account1.accountNumber = 1234;
		account2.accountNumber =1234;
		
		
		 
		
		if(account1.equals(account2)) {
			System.out.println("Bank accounts are same ");
		}
		else {
			System.out.println("Bank accounts are different ");
		}
		
		
		System.out.println(+account1.hashCode());
		System.out.println(+account2.hashCode());
	}


}
 


