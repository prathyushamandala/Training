package com.visam.java.cloneobject;

public class Account implements Cloneable {
	private int Accountnumber;
	private double AccountBalance;
	private String AccountName;
	//private HomeloanAccount homeloanAcc;
	
	//public Account(int accnumber,double accbal,String accname) {
		/*this.Accountnumber = accnumber;
		this.AccountBalance = accbal;
		this.AccountName = accname;
		this.homeloanAcc = hlacc;   we can do using constructor also*/
	
		protected Object clone() throws CloneNotSupportedException {
	        return super.clone();
	}
		public int getAccountnumber() {
			return Accountnumber;
		}
		public void setAccountnumber(int accountnumber) {
			Accountnumber = accountnumber;
		}
		public String getAccountName() {
			return AccountName;
		}
		public void setAccountName(String accountName) {
			AccountName = accountName;
		}
	
		
	
 /*public class HomeloanAccount {
	 private int Accountnumber;
	 private String Accountname;
	 
	 public HomeloanAccount(int accnumber,String accname) {
		 this.Accountname=accname;
		 this.Accountnumber=accnumber;
	 }
	 
 }*/
}
 