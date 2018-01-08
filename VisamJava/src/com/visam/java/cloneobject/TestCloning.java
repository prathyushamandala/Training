package com.visam.java.cloneobject;

public class TestCloning {
	public static void main(String args[]) throws CloneNotSupportedException{
		//HomeloanAccount hlacc =new HomeloanAccount(1001,"Prathyusha");
		Account a1= new Account();
		Account Myaccount = (Account) a1.clone();
		BankAccount ba = new BankAccount();
		//System.out.println(Myaccount.Accountnumber);
		a1.setAccountnumber(10001);
		//System.out.println(a1.getAccountnumber());
		 a1.setAccountName("Joe");
		 //System.out.println(a1.getAccountName());
		 Myaccount.setAccountName("Manda");
		// System.out.println(a1.getAccountName());
		 
		 System.out.println(a1!=Myaccount);
		 System.out.println(a1.equals(Myaccount));
		 System.out.println(!(Myaccount instanceof Account));
		 System.out.println(Myaccount.getClass()==a1.getClass());
			
		 
		 System.out.println("these are equal");
			 
		 

			
		
}
}
