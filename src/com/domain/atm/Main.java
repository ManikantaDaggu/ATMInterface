package com.domain.atm;

public class Main {

	public static void main(String[] args) {
			BankAccount useraccount= new BankAccount(1000);
			ATM atm=new ATM(useraccount);
			atm.start();
	}

}
