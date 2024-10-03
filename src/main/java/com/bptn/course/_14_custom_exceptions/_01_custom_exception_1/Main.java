package com.bptn.course._14_custom_exceptions._01_custom_exception_1;

public class Main {

	public static void main(String[] args)  {
		
		BankAccount ba = new BankAccount(1000, "43589788");
		
		try {
		ba.withdraw(200); 
		ba.withdraw(600);
		ba.withdraw(600);
		}
		
		catch(InsufficientFundsException e) {
		System.out.println("You have insufficient funds. You need $" + e.getAmount() + " more to complete this transaction");	
		}

	}

}
