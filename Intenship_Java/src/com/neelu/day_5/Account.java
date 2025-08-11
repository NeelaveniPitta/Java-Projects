package com.neelu.day_5;

import java.util.ArrayList;

public class Account {

	private String accountHolder;
	private double balance;
	private ArrayList<String> transactionHistory;
	
	public Account(String accountHolder, double initialBalance) {
		this.accountHolder = accountHolder;
		this.balance = initialBalance;
		this.transactionHistory = new ArrayList<>();
		this.transactionHistory.add("Account created with balance: "+initialBalance);
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			transactionHistory.add("Deposited: "+amount);
			System.out.println("Successfully deposited: "+amount);
			System.out.println("Total balance: "+balance);
		}
		else {
			System.out.println("Deposit amount must be +ve.");
		}
	}
	
	public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
        	balance -= amount;
            transactionHistory.add("Withdrew: " + amount);
            System.out.println("Successfully withdrew: " + amount);
            System.out.println("Total balance: "+balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
	
	public double getBalance() {
        return balance;
    }

    public void showTransactionHistory() {
        System.out.println("--- Transaction History ---");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }
}
