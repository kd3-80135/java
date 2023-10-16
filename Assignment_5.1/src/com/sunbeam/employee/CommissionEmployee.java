package com.sunbeam.employee;

import java.util.Scanner;

public class CommissionEmployee extends Employee{
	
	private double commissionRate;
	private int grossSales;

	public CommissionEmployee() {
	}
	
	@Override
	public void accept() {
		System.out.println("For Commission Employee.");
		super.accept();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the commission of the employee : ");
		this.commissionRate = sc.nextDouble();
		System.out.print("Enter the Gross sales made by the employee : ");
		this.grossSales = sc.nextInt();
	}
	
	@Override
	double calculateTotalSalary() {
		return this.commissionRate*this.grossSales;
	}

	@Override
	public String toString() {
		return "CommissionEmployee [commissionRate=" + commissionRate + ", grossSales=" + grossSales
				+ ", calculateTotalSalary()=" + calculateTotalSalary() + ", toString()=" + super.toString() + "]";
	}

	
}
