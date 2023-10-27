package com.domain.atm;

import java.util.Scanner;

public class BankAccount {
	private double balance ;
	
	public BankAccount(double initialbalance) {
		balance =initialbalance;
	}
	public double getbalance() {
		return balance;
	}
	public void deposit (double amount) {
		if(amount>0)
		{
			balance+=amount;
			System.out.println("Money Deposited Successfully : "+amount);
		}
		else
		{
			System.out.println("Invalid amount for Deposit");
		}
	}
	public void withdrawamount(double amount) {
		if(amount>0 && amount<=balance) {
			balance-=amount;
			System.out.println("Money Withdrawal Successful :"+amount);
		}
		else {
			System.out.println("Insufficient balance or invalid amount for withdrawal");
		}
	}
}
class ATM{
	private BankAccount account;
	private Scanner scanner;
	
	public ATM(BankAccount account) {
		this.account=account;
		scanner=new Scanner(System.in);
	}
	public void showmenu() {
		System.out.println("***** Welcome to the ATM *****");
		System.out.println(" ATM Menu");
		System.out.println("1.Check Balance");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.Exit");
	}
	public void start() {
		int choice;
		do {
			showmenu();
			System.out.println("Enter your Choice");
			choice=scanner.nextInt();
			switch(choice) {
			case 1:
				checkBalance();
				break;
			case 2:
				deposit();
				break;
			case 3: 
				withdraw();
				break;
			case 4:
				System.out.println("Existing Atm. Thank you");
				break;
			default :
				System.out.println("Invalid choice.Please Select a Valid Option!");
			}
			
		}
		while(choice !=4);
	}
	private void checkBalance()
	{
		System.out.println("Current Balance : "+ account.getbalance());
	}
	private void deposit()
	{
		System.out.println("Enter Deposit amount :");
		double amount=scanner.nextDouble();
		account.deposit(amount);
	}
	private void withdraw() {
		System.out.println("Enter the Withdrawal Amount:");
		double amount=scanner.nextDouble();
		account.withdrawamount(amount);
	}
	
}
