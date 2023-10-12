package com.sunbeam.calculator;
import java.util.Scanner;

public class CreditLimitCalculator {
	private int accountNumber;
	private int initialBalance;
	private int creditLimit;
	private int totalMonthlyCharge;
	private int totalCreditsApplied;
	
	public CreditLimitCalculator (){
		this(0,0,0,0,0);	
	}

	public CreditLimitCalculator(int accountNumber, int initialBalance, int creditLimit, int totalMonthlyCharge,
			int totalCreditsApplied) {
		this.accountNumber = accountNumber;
		this.initialBalance = initialBalance;
		this.creditLimit = creditLimit;
		this.totalMonthlyCharge = totalMonthlyCharge;
		this.totalCreditsApplied = totalCreditsApplied;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getInitialBalance() {
		return initialBalance;
	}

	public void setInitialBalance(int initialBalance) {
		this.initialBalance = initialBalance;
	}

	public int getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}

	public int getTotalMonthlyCharge() {
		return totalMonthlyCharge;
	}

	public void setTotalMonthlyCharge(int totalMonthlyCharge) {
		this.totalMonthlyCharge = totalMonthlyCharge;
	}

	public int getTotalCreditsApplied() {
		return totalCreditsApplied;
	}

	public void setTotalCreditsApplied(int totalCreditsApplied) {
		this.totalCreditsApplied = totalCreditsApplied;
	}
	
	public void accept () {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Account Number : ");
		this.accountNumber = sc.nextInt();
		System.out.print("Enter the Initial Balance : ");
		this.initialBalance = sc.nextInt();
		System.out.print("Enter the total monthly expense : ");
		this.totalMonthlyCharge = sc.nextInt();
		System.out.print("Enter the amount of credits applied : ");
		this.totalCreditsApplied = sc.nextInt();
		System.out.print("Enter the Credit Limit : ");
		this.creditLimit = sc.nextInt();
	}
	
	public void display () {
		System.out.println("The customer's Account Number is "+this.accountNumber);
		int newBalance = this.initialBalance + this.totalMonthlyCharge - this.totalCreditsApplied;
		System.out.println("The Final Balance is "+ newBalance);
		if (newBalance>this.creditLimit) {
			System.out.println("Credit Limit Exceeded. ");
		}
		else {
			System.out.println("Credit limit in check. ");	
		}
	}
}