package com.bptn.course._14_custom_exceptions._01_custom_exception_1;

public class BankAccount {
	double balance; 
	String accountNumber;
	
	
	public BankAccount(double balance, String accountNumber) {
		this.balance = balance;
		this.accountNumber = accountNumber;
	} 

	
	public void withdraw(double amount) throws InsufficientFundsException {
		
		if (amount > balance) {
			double wants = amount - balance;
			throw new InsufficientFundsException(wants);
		}
		balance -= amount; 
		System.out.println("Withdrawal of $" + amount + " successful. New balance is: $" + balance);
	}
	

}
