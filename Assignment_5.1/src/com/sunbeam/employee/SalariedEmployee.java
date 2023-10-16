package com.sunbeam.employee;

import java.util.Scanner;

public class SalariedEmployee extends Employee{
	
	private double weeklySalary;

	public SalariedEmployee() {
	}
	
	@Override
	public void accept() {
		System.out.println("For Salaried Employee.");
		super.accept();
		System.out.println("Enter the Weekly Salary : ");
		this.weeklySalary = new Scanner(System.in).nextDouble();
	}
	
	public double calculateTotalSalary () {
		return this.weeklySalary;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [calculateTotalSalary()=" + calculateTotalSalary() + ", toString()=" + super.toString()
				+ "]";
	}
}
