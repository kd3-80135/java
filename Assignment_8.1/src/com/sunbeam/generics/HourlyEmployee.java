package com.sunbeam.generics;

import java.util.Scanner;

public class HourlyEmployee extends Employee{

	private double hourlyWage;
	private int hoursWorked;
	
	public HourlyEmployee() {	
	}
	
	@Override
	public void accept() {
		System.out.println("For Hourly Employee.");
		super.accept();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the hourly wage : ");
		this.hourlyWage = sc.nextDouble();
		System.out.println("Enter the hours worked : ");
		this.hoursWorked = sc.nextInt();
	}
	
	@Override
	double calculateTotalSalary() {
		if(this.hoursWorked<=40) {
			return this.hourlyWage*this.hoursWorked;
		}
		else {
			return 40*this.hourlyWage+(this.hoursWorked-40)*this.hourlyWage*1.5;
		}
	}

	@Override
	public String toString() {
		return "HourlyEmployee [hourlyWage=" + hourlyWage + ", hoursWorked=" + hoursWorked + ", calculateTotalSalary()="
				+ calculateTotalSalary() + ", toString()=" + super.toString() + "]";
	}
}
